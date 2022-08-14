package com.example.league;

/*
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author james
 */
public class League {

    public static void main(String[] args) {
        BufferedReader br;
        List<LeagueScore> finalResult = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("/home/james/NetBeansProjects/league/files/test.txt"));
            String line = br.readLine();
            while (line != null) {
                finalResult.addAll(MatchResult.getMatchResult(line));
                line = br.readLine();
            }
            LeagueResult.drawLeagueResult(finalResult);
        } catch (IOException ex) {
            Logger.getLogger(League.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
