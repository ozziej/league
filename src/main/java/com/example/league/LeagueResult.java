/*
 */
package com.example.league;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author james
 */
public class LeagueResult {

    public static void drawLeagueResult(List<LeagueScore> finalResult) {

        List<LeagueScore> result = calculateResult(finalResult);
        Collections.sort(result, Comparator.comparing(LeagueScore::getScore).reversed()
                .thenComparing(LeagueScore::getTeamName));

        int tablePosition = 1;
        int internalCounter = 0;
        int previousScore = -1;

        for (LeagueScore s : result) {
            int score = s.getScore();
            String teamName = s.getTeamName();
            internalCounter++;

            if (score != previousScore) {
                previousScore = score;
                tablePosition = internalCounter;
            }

            System.out.println(tablePosition + ". " + teamName + ", " + score + " pts");

        }
    }

    private static List<LeagueScore> calculateResult(List<LeagueScore> finalResult) {
        List<LeagueScore> finalScores = new ArrayList<>();

        finalResult.stream().map(i -> i.getTeamName()).distinct().forEach(i -> {
            finalScores.add(new LeagueScore(i, finalResult.stream().filter(o -> o.getTeamName().equals(i)).collect(Collectors.summingInt(v -> v.getScore()))));
        });

        return finalScores;
    }
}
