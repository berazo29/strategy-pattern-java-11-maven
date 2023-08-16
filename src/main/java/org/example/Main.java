package org.example;

public class Main {

    public static void main(String[] args) {
        Buck buck = new Buck();
        buck.setIFlyBehaviour(new SimpleFlying());
        buck.fly();
        buck.setIFlyBehaviour(new JetFlying());
        buck.fly();
    }
}