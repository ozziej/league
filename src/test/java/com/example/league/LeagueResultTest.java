/*
 */
package com.example.league;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author james
 */
public class LeagueResultTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public LeagueResultTest() {
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testDrawLeagueResult() {
        List<LeagueScore> finalResult = new ArrayList<>();
        finalResult.add(new LeagueScore("Team One", 3));
        finalResult.add(new LeagueScore("Team Two", 1));
        finalResult.add(new LeagueScore("Team Three", 1));
        LeagueResult.drawLeagueResult(finalResult);
        assertEquals("1. Team One, 3 pts\n2. Team Three, 1 pts\n2. Team Two, 1 pts", outContent.toString().trim());
    }

}
