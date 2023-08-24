package org.example.behaviour;

import org.example.interfaces.ISwimBehaviour;

public class JetSwim implements ISwimBehaviour {
    @Override
    public void swim() {
        System.out.println("Jet swimming...");
    }
}
