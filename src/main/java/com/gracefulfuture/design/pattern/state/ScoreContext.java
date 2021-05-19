package com.gracefulfuture.design.pattern.state;

public class ScoreContext {
    private ScoreState scoreState;

    public ScoreContext() {
        this.scoreState = new LowScoreState(this);
    }

    public ScoreState getScoreState() {
        return scoreState;
    }

    public void setScoreState(ScoreState scoreState) {
        this.scoreState = scoreState;
    }

    public void add(int increment){
        this.scoreState.addScore(increment);
    }
}
