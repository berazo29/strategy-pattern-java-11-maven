package org.example;

import org.example.interfaces.IEatBehaviour;
import org.example.interfaces.ISwimBehaviour;
import org.example.model.SurgeonFish;
import org.junit.jupiter.api.Test;

class SurgeonFishTest {

    static private class mockSwim implements ISwimBehaviour {
        @Override
        public void swim() {
            System.out.println("Mocking the swimming behaviour...");
        }
    }

    static private class mockEat implements IEatBehaviour {
        @Override
        public void eat() {
            System.out.println("Mocking the eating behaviour...");
        }
    }

    @Test
    void testSwim() {
        SurgeonFish surgeonFish = new SurgeonFish();
        surgeonFish.setISwimBehaviour(new mockSwim());
        surgeonFish.performSwim();
    }

    @Test
    void testEat() {
        SurgeonFish surgeonFish = new SurgeonFish();
        surgeonFish.setIEatBehaviour(new mockEat());
        surgeonFish.performEat();
    }
}