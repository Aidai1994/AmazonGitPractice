package com.digital_nomads.javaFall2021.applications;

public abstract class KyrgyzstanBankAbstract implements KyrgyzstanBankInterface{

    private String phoneNumber;

    public KyrgyzstanBankAbstract (String phoneNumber){

        if (phoneNumber.length() != 13 || !phoneNumber.startsWith("+")){
            System.out.println("Invalid phone number");
        }
        else {
            this.phoneNumber = phoneNumber;
        }
    }


    public KyrgyzstanBankAbstract(long accountNumber, long routingNumber) {
    }
}
