package org.example.model;

import lombok.Data;
import org.example.behaviour.*;
import org.example.interfaces.INavigateBehaviour;

@Data
public class Shark extends Fish {
    private INavigateBehaviour iNavigateBehaviour;

    public Shark() {
        this.iNavigateBehaviour = new SimpleNavigator();
        this.setIEatBehaviour(new Carnivorous());
        this.setISwimBehaviour(new JetSwim());
    }

    public void performNavigation() {
        iNavigateBehaviour.navigate();
    }
}
