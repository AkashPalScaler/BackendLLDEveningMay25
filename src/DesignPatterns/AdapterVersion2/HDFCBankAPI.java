package DesignPatterns.AdapterVersion2;

public class HDFCBankAPI {
    HDFCBankTransferResponse transfer(HDFCBankTransferRequest payload){
        return new HDFCBankTransferResponse("JSYVDYGBK123", true); 
    }
}
