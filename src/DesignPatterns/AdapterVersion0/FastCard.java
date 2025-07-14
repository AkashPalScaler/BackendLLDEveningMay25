package DesignPatterns.AdapterVersion0;

public class FastCard {
    String fastCardUPI = "fastcard@ybl";

    void rechargeCard(YesBankAPI bankAPI, String userUPI, int amount){
        bankAPI.transferAmount(userUPI, fastCardUPI, amount);
    }   
}
