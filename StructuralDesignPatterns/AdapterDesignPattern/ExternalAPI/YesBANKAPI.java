package StructuralDesignPatterns.AdapterDesignPattern.ExternalAPI;

public class YesBANKAPI {
    public double getBalance() {
        return 100;
    }
    public String transferMoney() {
        return "Yes Bank Money Transfer Successful";
    }
}
