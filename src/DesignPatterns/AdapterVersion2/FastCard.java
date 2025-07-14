package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class FastCard {
    String fastCardUPI = "fastcard@ybl";

    void rechargeCard(BankAPIInterface bankAPI, String userUPI, int amount){
        bankAPI.sendMoney(amount, userUPI, fastCardUPI);
    }   
}
