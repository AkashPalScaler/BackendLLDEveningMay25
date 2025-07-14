package DesignPatterns.AdapterVersion0;

public class Loan {
    final int eligibleAmount = 100000;
    boolean checkLoanEligibility(YesBankAPI bankAPI){
        if(bankAPI.getBalance() > eligibleAmount){
            return true;
        }
        return false;
    }
}
