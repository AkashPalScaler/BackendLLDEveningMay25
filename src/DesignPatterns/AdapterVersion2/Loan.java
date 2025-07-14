package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class Loan {
    final int eligibleAmount = 100000;
    boolean checkLoanEligibility(BankAPIInterface bankAPI){
        if(bankAPI.getBalanceInfo() > eligibleAmount){
            return true;
        }
        return false;
    }
}
