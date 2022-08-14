package com.example.league.test;

/*
 */
import com.example.league.ScoreResultEnum;
import com.example.league.MatchResult;
import com.example.league.LeagueScore;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author james
 */
public class MatchResultTest {

    public MatchResultTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMatchResult method, of class MatchResult.
     */
    @Test
    public void testMatchResultSize() {
        String line = "Lions 3, Snakes 3";
        List<LeagueScore> expResult = new ArrayList<>();
        expResult.add(new LeagueScore("Lions", ScoreResultEnum.DRAW.value));
        expResult.add(new LeagueScore("Snakes", ScoreResultEnum.DRAW.value));
        List<LeagueScore> result = MatchResult.getMatchResult(line);
        System.out.println("result" + result.toString());
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testMatchResultValue() {
        String line = "Lions 3, Snakes 3";
        List<LeagueScore> expResult = new ArrayList<>();
        expResult.add(new LeagueScore("Lions", ScoreResultEnum.DRAW.value));
        expResult.add(new LeagueScore("Snakes", ScoreResultEnum.DRAW.value));
        List<LeagueScore> result = MatchResult.getMatchResult(line);
        System.out.println("result" + result.toString());
        assertEquals(expResult, result);
    }

}
