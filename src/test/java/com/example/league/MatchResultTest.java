package com.example.league;

/*
 */
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author james
 */
public class MatchResultTest {

    private static String line;
    private static List<LeagueScore> expResult;
    private static List<LeagueScore> result;
    
    public MatchResultTest() {
        line = "Lions 3, Snakes 3";
        expResult = new ArrayList<>();
        expResult.add(new LeagueScore("Lions", ScoreResultEnum.DRAW.value));
        expResult.add(new LeagueScore("Snakes", ScoreResultEnum.DRAW.value));
        result = MatchResult.getMatchResult(line);
    }

    /**
     * Test of getMatchResult method, of class MatchResult.
     */
    @Test
    public void testMatchResultSize() {
        System.out.println("result" + result.toString());
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testMatchResultValue() {
        System.out.println("result" + result.toString());
        assertEquals(expResult, result);
    }

}
