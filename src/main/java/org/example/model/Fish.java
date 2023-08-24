package org.example.model;

import lombok.Data;
import org.example.interfaces.IEatBehaviour;
import org.example.interfaces.ISwimBehaviour;

@Data
public abstract class Fish {
    private IEatBehaviour iEatBehaviour;
    private ISwimBehaviour iSwimBehaviour;

    public void performEat() {
        iEatBehaviour.eat();
    }

    public void performSwim() {
        iSwimBehaviour.swim();
    }
}
