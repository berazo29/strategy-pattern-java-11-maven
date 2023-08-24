package org.example.behaviour;

import org.example.interfaces.ISwimBehaviour;

public class SimpleSwim implements ISwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I am swimming normally...");
    }
}
