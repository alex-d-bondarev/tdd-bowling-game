package org.practice.app.step7;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.practice.app.step7.Game;

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

    @Test
    public void oneSPare(){
        rollSpare();
        g.roll(1);
        rollMany(17, 0);
        assertEquals(12, g.score());
    }

    private void rollGameOf(int pins) {
        rollMany(20, pins);
    }

    private void rollMany(int times, int pins){
        for (int i = 0; i < times; i++) {
            g.roll(pins);
        }
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
}
