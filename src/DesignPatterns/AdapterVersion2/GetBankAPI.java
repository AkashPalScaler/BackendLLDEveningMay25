package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class GetBankAPI {
    public static BankAPIInterface getBankAdapter(String bankname){
        if(bankname =="YesBank"){
            return new YesBankAPIAdapter(); 
        }else if(bankname =="ICICI"){
            return new ICICIBankAPIAdapter();
        }else if(bankname =="HDFC"){
            return new HDFCBankAPIAdapter();
        }else{
            System.out.println("Invalid Bank");
        }
        return null;
    }
}

