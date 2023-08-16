package org.example;

import lombok.Data;

@Data
public class Buck {
    public void getFly(IFlyBehaviour iFlyBehaviour) {
        iFlyBehaviour.fly();
    }
}
