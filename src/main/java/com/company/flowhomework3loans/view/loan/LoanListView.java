package com.company.flowhomework3loans.view.loan;

import com.company.flowhomework3loans.entity.Loan;

import com.company.flowhomework3loans.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "loans", layout = MainView.class)
@ViewController("Loan.list")
@ViewDescriptor("loan-list-view.xml")
@LookupComponent("loansDataGrid")
@DialogMode(width = "64em")
public class LoanListView extends StandardListView<Loan> {
}