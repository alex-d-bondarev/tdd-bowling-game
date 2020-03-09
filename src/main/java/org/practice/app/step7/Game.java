package org.practice.app.step7;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int firstInRound = 0;
        for (int round = 0; round < 10; round++) {
            if(isSpare(firstInRound)) {
                score += 10 + rolls[firstInRound + 2];
                firstInRound+=2;
            } else {
                score += rolls[firstInRound] + rolls[firstInRound + 1];
                firstInRound+=2;
            }
        }
        return score;
    }

    private boolean isSpare(int firstInRound) {
        return rolls[firstInRound] + rolls[firstInRound+1] == 10;
    }
}
