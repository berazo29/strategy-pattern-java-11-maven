package org.example.behaviour;

import org.example.interfaces.IEatBehaviour;

public class Herbivorous implements IEatBehaviour {
    @Override
    public void eat() {
        System.out.println("Eat vegetables and plans only...");
    }
}
