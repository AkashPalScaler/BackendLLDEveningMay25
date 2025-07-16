package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class PhonePe {
    BankAPIInterface bankAPI;
    Loan loan = new Loan();
    FastCard fastCard = new FastCard();
    String userUPI= "aksh@ybl";

    public PhonePe(BankAPIInterface bankAPI){
        this.bankAPI = bankAPI;
    }

    public void setBankAPI(BankAPIInterface bankAPI){
        this.bankAPI = bankAPI;
    }
    
    void checkLoanEligibility(){
        if(loan.checkLoanEligibility(bankAPI)){
            System.out.println("Eligible for loan");
        }else{
            System.out.println("Not eligible for loan");
        }
    }

    void rechargeFastCard(int amount){
        fastCard.rechargeCard(bankAPI, userUPI, amount);
    }
}
