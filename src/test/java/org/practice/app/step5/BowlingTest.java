package org.practice.app.step5;

import org.junit.Before;
import org.junit.Test;
import org.practice.app.step5.Game;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    private Game g;

    @Before
    public void setUp(){
        g = new Game();
    }

    @Test
    public void gutterGame(){
        rollGameOf(0);
        assertEquals(0, g.score());
    }

    @Test
    public void allOnes(){
        rollGameOf(1);
        assertEquals(20, g.score());
    }

    private void rollGameOf(int pins) {
        for (int i = 0; i < 20; i++) {
            g.roll(pins);
        }
    }
}
