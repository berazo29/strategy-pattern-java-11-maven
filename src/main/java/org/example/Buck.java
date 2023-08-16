package org.example;

import lombok.Data;

@Data
public class Buck {
    private IFlyBehaviour iFlyBehaviour;
    public void fly() {
        iFlyBehaviour.fly();
    }
}
