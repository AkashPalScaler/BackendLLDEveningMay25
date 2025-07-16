package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class Client {
    public static void main(String[] args) {
        String bank = "YesBank";
        BankAPIInterface bankAPI = GetBankAPI.getBankAdapter(bank);

        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.checkLoanEligibility();

        phonePe.setBankAPI(GetBankAPI.getBankAdapter("ICICI"));

        phonePe.checkLoanEligibility();

    }
    
}
