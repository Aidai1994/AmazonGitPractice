package com.digital_nomads.javaFall2021.exceptions1;

public class Exceptions {
    public static void main(String[] args) {

//        int a [] = new int[3];
//        System.out.println(a[1]);

        try{
            int a [] = new int[3];
            System.out.println(a[4]);
            System.out.println("Hello World");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
