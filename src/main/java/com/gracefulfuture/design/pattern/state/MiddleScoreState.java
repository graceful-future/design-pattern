package com.gracefulfuture.design.pattern.state;

public class MiddleScoreState extends ScoreState{

    public MiddleScoreState(ScoreState scoreState){
        this.scoreContext = scoreState.scoreContext;
        this.stateName = "中等";
        this.score = scoreState.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            scoreContext.setScoreState(new LowScoreState(this));
        } else if (score >= 90) {
            scoreContext.setScoreState(new HighScoreState(this));
        }
    }
}
