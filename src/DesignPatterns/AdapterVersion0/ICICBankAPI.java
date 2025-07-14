package DesignPatterns.AdapterVersion0;

public class ICICBankAPI {
    int fetchBalance(){
        return 0;
    }

    void makeTransfer(String fromUPI, String toUPI, int amount){
        if(fetchBalance() < amount){
            throw new RuntimeException("insufficient balance");
        }
    }    
    
}
