package com.example.league;


import java.util.Objects;

/*
 */

/**
 *
 * @author james
 */
public class LeagueScore {
    private String teamName;
    private Integer score;

    public LeagueScore() {
    }

    public LeagueScore(String teamName, Integer score) {
        this.teamName = teamName;
        this.score = score;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.teamName);
        hash = 59 * hash + Objects.hashCode(this.score);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LeagueScore other = (LeagueScore) obj;
        if (!Objects.equals(this.teamName, other.teamName)) {
            return false;
        }
        return this.score.equals(other.score);
    }

    @Override
    public String toString() {
        return "LeagueScore{" + "teamName=" + teamName + ", score=" + score + '}';
    }
    
}
