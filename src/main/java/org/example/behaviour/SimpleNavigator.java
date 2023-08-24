package org.example.behaviour;

import org.example.interfaces.INavigateBehaviour;

public class SimpleNavigator implements INavigateBehaviour {

    @Override
    public void navigate() {
        System.out.println("I implement simple navigator");
    }
}
