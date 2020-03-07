package org.practice.app.step3;

import org.junit.Before;
import org.junit.Test;
import org.practice.app.step3.Game;

public class BowlingTest {
    private Game g;

    @Before
    public void setUp(){
        g = new Game();
    }

    @Test
    public void canRoll(){
        g.roll(0);
    }
}
