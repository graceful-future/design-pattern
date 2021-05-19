package com.gracefulfuture.design.pattern.state;

public class HighScoreState extends ScoreState{

    public HighScoreState(ScoreState scoreState){
        this.scoreContext = scoreState.scoreContext;
        this.stateName = "优秀";
        this.score = scoreState.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            scoreContext.setScoreState(new LowScoreState(this));
        } else if (score < 90) {
            scoreContext.setScoreState(new MiddleScoreState(this));
        }
    }
}
