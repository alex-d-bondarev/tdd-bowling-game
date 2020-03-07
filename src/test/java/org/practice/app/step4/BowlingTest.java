package org.practice.app.step4;

import org.junit.Before;
import org.junit.Test;
import org.practice.app.step4.Game;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void gutterGame(){
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }
}
