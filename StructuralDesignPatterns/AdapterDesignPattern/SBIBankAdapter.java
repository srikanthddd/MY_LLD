package StructuralDesignPatterns.AdapterDesignPattern;

import StructuralDesignPatterns.AdapterDesignPattern.ExternalAPI.SBIBankAPI;

public class SBIBankAdapter implements BankAPIAdapter{

    SBIBankAPI sbiBankAPI = new SBIBankAPI();
    public double getBalance() {
        return sbiBankAPI.getBalance();
    }
    public String transferMoney() {
        return sbiBankAPI.transferMoney();
    }
}
