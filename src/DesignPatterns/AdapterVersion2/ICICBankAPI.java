package DesignPatterns.AdapterVersion2;

public class ICICBankAPI {
    String toUPI;
    int fetchBalance(){
        return 0;
    }

    void verifyAndAddDestinationUPI(String toUPI){
        //validate toUPI
        // throw new Exception("Invalid UPI")
        this.toUPI = toUPI;
    }

    void makeTransfer(String fromUPI, int amount){
        if(fetchBalance() < amount){
            throw new RuntimeException("insufficient balance");
        }
    }    
    
}
