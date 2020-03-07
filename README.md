tdd-bowling-game
================

This repository represents **TDD Part-Part 2** video from the 
[Clean Code course by Robert C. Martin](https://www.oreilly.com/library/view/clean-code/9780134661742/).
It was created for a step by step presentation of Bowling Game TDD example. 

Rules
-----

* A game of bowling consists of 10 rounds. 
* Each round provides a player with tries to knock 10 pins with a ball.
* When player knocks 10 pins in first 2 tries that is called Spare. Spare round score is 10 + score for the next 1 ball.
* When player knocks 10 pins in first 1 try that is called Strike. Strike round score is 10 + score for the next 2 balls.
* Rounds 1-9 consist of 2 tries for knocking max 10 pins.
* Player can have 3 tries in round 10 and knock up to 30 pins:
    * Scoring 9 or less in 2 tries gives the regular 2 tries;
    * Scoring the Spare provides an additional 3rd try with additional 10 pins;
    * Scoring the Strike provides additional 2 tries with additional 10 pins;
    * Having 2 Strikes in a row provides an additional 3rd try with additional 10 pins;
    
Goal
----

Create a **Game** class with `void roll(int pins)` and `int score()` methods.
* `roll()` method should save result of each try
* `score()` method returns the score of the game

Invalid inputs, such as negative, rolls than 10 or rounds bigger than 10 are ignored for presentation simplicity.  

Possible solution
-----------------

We might have a `Game.class`, a `Round.class`, a `Roll.class` and a `TenthRound.class` for the last specific round :)