package org.example;

import org.junit.jupiter.api.Test;

class BuckTest {

    static private class mockFlying implements IFlyBehaviour {
        @Override
        public void fly() {
            System.out.println("Mocking the fly...");
        }
    }

    @Test
    void getFly() {
        Buck buck = new Buck();
        buck.getFly(new mockFlying());
    }
}