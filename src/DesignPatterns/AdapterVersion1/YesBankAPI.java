package DesignPatterns.AdapterVersion1;

public class YesBankAPI implements BankAPIInterface {
    public int getBalanceInfo(){
        return 0;
    }

    public boolean sendMoney( int amount,String fromUPI, String toUPI){
        if(getBalanceInfo() < amount){
            throw new RuntimeException("insufficient balance");
        }
        return true;
    } 
}
