package DesignPatterns.AdapterVersion2;

public class HDFCBankTransferResponse {
    String transactionID;
    boolean status;
    
    public HDFCBankTransferResponse(String transactionID, boolean status) {
        this.transactionID = transactionID;
        this.status = status;
    }
}
