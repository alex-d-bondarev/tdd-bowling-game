package org.practice.app.step5;

public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    // Score should be calculated here, not in roll().
    // Current approach violates deign principles.
    public int score() {
        return score;
    }
}
