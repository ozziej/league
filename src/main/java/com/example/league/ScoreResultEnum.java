package com.example.league;

/*
 */
/**
 *
 * @author james
 */
public enum ScoreResultEnum {
    
    WIN(3), LOSE(0), DRAW(1);
    
    public final Integer value;

    private ScoreResultEnum(Integer value) {
        this.value = value;
    }
}
