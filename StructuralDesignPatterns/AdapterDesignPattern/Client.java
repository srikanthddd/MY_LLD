package StructuralDesignPatterns.AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        System.out.println(phonePe.getBalance());
        System.out.println(phonePe.transferMoney());
    }
}
