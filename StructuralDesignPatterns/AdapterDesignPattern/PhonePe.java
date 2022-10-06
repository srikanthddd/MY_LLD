package StructuralDesignPatterns.AdapterDesignPattern;

public class PhonePe {
    BankAPIAdapter bankAPIAdapter = new SBIBankAdapter();

    // BankAPIAdapter bankAPIAdapter = new SBIBankAdapter();
    // Based on the bank, we can simply update this from one bank to another bank.
    public double getBalance(){
        return bankAPIAdapter.getBalance();
    }
    public String transferMoney(){
        return bankAPIAdapter.transferMoney();
    }
}
