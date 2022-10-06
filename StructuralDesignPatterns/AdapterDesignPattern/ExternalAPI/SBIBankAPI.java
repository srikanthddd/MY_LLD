package StructuralDesignPatterns.AdapterDesignPattern.ExternalAPI;

public class SBIBankAPI {

    public double getBalance() {
        return 500;
    }
    public String transferMoney() {
        return "SBI bank money transfer successful";
    }
}
