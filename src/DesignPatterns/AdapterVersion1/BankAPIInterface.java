package DesignPatterns.AdapterVersion1;

public interface BankAPIInterface {
   int getBalanceInfo();
   boolean sendMoney(int amount, String fromUPI, String toUPI);
}
