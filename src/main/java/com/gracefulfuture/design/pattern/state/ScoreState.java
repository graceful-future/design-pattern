package com.gracefulfuture.design.pattern.state;

public abstract class ScoreState {
    protected int score;
    protected String stateName;
    protected ScoreContext scoreContext;
    public abstract void checkState();
    public void addScore(int increment){
        score += increment;
        System.out.println("加分: " + increment + " 当前分数: " + score);
        checkState();
        System.out.println("当前状态: " + scoreContext.getScoreState().stateName);
    }
}
