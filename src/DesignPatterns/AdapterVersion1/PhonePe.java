package DesignPatterns.AdapterVersion1;

//DEPENDENCY INVERSION
public class PhonePe {
    BankAPIInterface bankAPI = new ICICBankAPI();
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
