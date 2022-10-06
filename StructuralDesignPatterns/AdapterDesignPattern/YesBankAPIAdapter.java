package StructuralDesignPatterns.AdapterDesignPattern;

import StructuralDesignPatterns.AdapterDesignPattern.ExternalAPI.YesBANKAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    YesBANKAPI yesBANKAPI = new YesBANKAPI();
    @Override
    public double getBalance() {
        return yesBANKAPI.getBalance();
    }

    @Override
    public String transferMoney() {
        return yesBANKAPI.transferMoney();
    }
}
