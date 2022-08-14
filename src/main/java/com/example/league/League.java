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

        if (args.length > 0 && !args[0].isEmpty()) {
            try {
                br = new BufferedReader(new FileReader(args[0]));
                String line = br.readLine();
                while (line != null) {
                    finalResult.addAll(MatchResult.getMatchResult(line));
                    line = br.readLine();
                }
                LeagueResult.drawLeagueResult(finalResult);
            } catch (IOException ex) {
                Logger.getLogger(League.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.err.println("Please include the file to run.");
        }
    }
}
