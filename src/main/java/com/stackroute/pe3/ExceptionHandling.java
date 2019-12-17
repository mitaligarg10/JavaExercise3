package com.stackroute.pe3;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
        try {
            throw new MyException("Errorrr has occurred!!!");
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("Hey! It got printed through exception handling..");
        }
    }
}
