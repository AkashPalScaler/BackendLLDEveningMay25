package DesignPatterns.AdapterVersion2;

public class HDFCBankTransferRequest {
    String fromUPI;
    String toUPI;
    int amount;
    public HDFCBankTransferRequest(String fromUPI, String toUPI, int amount) {
        this.fromUPI = fromUPI;
        this.toUPI = toUPI;
        this.amount = amount;
    }

}
