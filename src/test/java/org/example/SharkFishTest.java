package org.example;

import org.example.interfaces.IEatBehaviour;
import org.example.interfaces.INavigateBehaviour;
import org.example.model.Shark;
import org.example.model.SurgeonFish;
import org.junit.jupiter.api.Test;

public class SharkFishTest {
    static private class mockNavigate implements INavigateBehaviour {
        @Override
        public void navigate() {
            System.out.println("Mocking the navigating behaviour...");
        }
    }
    @Test
    void testMockNavigate() {
        Shark shark = new Shark();
        shark.setINavigateBehaviour(new mockNavigate());
        shark.performNavigation();
    }
}
