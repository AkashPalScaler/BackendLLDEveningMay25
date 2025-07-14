package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class YesBankAPIAdapter implements BankAPIInterface{
    YesBankAPI yb = new YesBankAPI();
    public int getBalanceInfo(){
        return yb.getBalance();
    }

    public boolean sendMoney( int amount,String fromUPI, String toUPI){
        return yb.transferAmount(fromUPI, toUPI, amount);
    }  
}
