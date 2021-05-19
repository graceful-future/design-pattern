package com.gracefulfuture.design.pattern.state;

public class LowScoreState extends ScoreState{

    public LowScoreState(ScoreContext scoreContext) {
        this.scoreContext = scoreContext;
        this.stateName = "不及格";
        this.score = 0;
    }

    public LowScoreState(ScoreState scoreState){
        this.scoreContext = scoreState.scoreContext;
        this.stateName = scoreState.stateName;
        this.score = scoreState.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            this.scoreContext.setScoreState(new HighScoreState(this));
        } else if (score >= 60) {
            this.scoreContext.setScoreState(new MiddleScoreState(this));
        }
    }
}
