package com.gracefulfuture.design.pattern.state;

public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.add(30);
        scoreContext.add(40);
        scoreContext.add(25);
        scoreContext.add(-15);
        scoreContext.add(-20);
    }
}
