package DesignPatterns.AdapterVersion2;

import DesignPatterns.AdapterVersion1.BankAPIInterface;

public class HDFCBankAPIAdapter implements BankAPIInterface {
    HDFCBankAPI hb = new HDFCBankAPI();
    public int getBalanceInfo(){
       throw new RuntimeException("Feature unavailable");
    }

    public boolean sendMoney( int amount,String fromUPI, String toUPI){
       //Converting client input to 3rd party input
        HDFCBankTransferRequest requestPayload = new HDFCBankTransferRequest(fromUPI, toUPI, amount);
       HDFCBankTransferResponse response = hb.transfer(requestPayload);
       // Converting 3rd party output to client output
       boolean status = response.status;
       return status;
    }  
}
