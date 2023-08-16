package org.example;

public class Main {

    public static void main(String[] args) {
        Buck buck = new Buck();
        buck.getFly(new SimpleFlying());
        buck.getFly(new JetFlying());
    }
}