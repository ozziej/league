package com.example.league;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 */
/**
 *
 * @author james
 */
public class MatchResult {
    
    public static List<LeagueScore> getMatchResult(String line) throws NumberFormatException {
        String splitRegex = "([^0-9]+)([0-9]+),([^0-9]+)([0-9]+)";
        Pattern pattern = Pattern.compile(splitRegex);
        Matcher matcher = pattern.matcher(line);
        List<LeagueScore> result = new ArrayList<>();
        if (matcher.matches()) {
            String teamOne = matcher.group(1).trim();
            Integer scoreOne = Integer.parseInt(matcher.group(2));
            String teamTwo = matcher.group(3).trim();
            Integer scoreTwo = Integer.parseInt(matcher.group(4));
            if (scoreOne > scoreTwo) {
                result.add(new LeagueScore(teamOne, ScoreResultEnum.WIN.value));
                result.add(new LeagueScore(teamTwo, ScoreResultEnum.LOSE.value));
            } else if (scoreTwo > scoreOne) {
                result.add(new LeagueScore(teamOne, ScoreResultEnum.LOSE.value));
                result.add(new LeagueScore(teamTwo, ScoreResultEnum.WIN.value));
            } else if (scoreOne.equals(scoreTwo)) {
                result.add(new LeagueScore(teamOne, ScoreResultEnum.DRAW.value));
                result.add(new LeagueScore(teamTwo, ScoreResultEnum.DRAW.value));
            }
        }
        
        return result;
        
    }
}
