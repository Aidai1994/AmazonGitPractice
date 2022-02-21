package com.digital_nomads.javaFall2021.applications;

import static com.digital_nomads.javaFall2021.applications.Bank.transferFunds;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank nursultanDemirBankAccount = new DemirBank(1234567891l,123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(12548451289l,6959856);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit: " + nursultanDemirBankAccount.getBalance());

       transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);

        System.out.println("Urmat's balance after transfer is: " + urmatDemirBankAccount.getBalance());
        System.out.println("Nursultan's balance after trancfer is: " + nursultanDemirBankAccount.getBalance());

        transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,2101);
        System.out.println(nursultanDemirBankAccount.getBalance());
    }
}
