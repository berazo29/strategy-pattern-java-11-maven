package org.example.behaviour;

import org.example.interfaces.IEatBehaviour;

public class Carnivorous implements IEatBehaviour {
    @Override
    public void eat() {
        System.out.println("Eat meat only");
    }
}
