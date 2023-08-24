package org.example.model;

import org.example.behaviour.Herbivorous;
import org.example.behaviour.SimpleSwim;

public class SurgeonFish extends Fish {
    public SurgeonFish() {
        this.setIEatBehaviour(new Herbivorous());
        this.setISwimBehaviour(new SimpleSwim());
    }
}
