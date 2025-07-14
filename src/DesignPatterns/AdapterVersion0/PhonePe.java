package DesignPatterns.AdapterVersion0;

public class PhonePe {
    YesBankAPI bankAPI = new YesBankAPI();
    Loan loan = new Loan();
    FastCard fastCard = new FastCard();
    String userUPI= "aksh@ybl";
    
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
