package com.company.flowhomework3loans.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import javax.annotation.Nullable;


public enum LoanStatus implements EnumClass<String> {

    REQUESTED("R"),
    APPROVED("A"),
    REJECTED("J");

    private String id;

    LoanStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LoanStatus fromId(String id) {
        for (LoanStatus at : LoanStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}