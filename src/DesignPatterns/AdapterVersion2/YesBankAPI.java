package DesignPatterns.AdapterVersion2;

public class YesBankAPI {
    int getBalance(){
        return 0;
    }

    boolean transferAmount(String fromUPI, String toUPI, int amount){
        return false;
    }
}
