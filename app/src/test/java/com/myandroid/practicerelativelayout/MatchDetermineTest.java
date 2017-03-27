package com.myandroid.practicerelativelayout;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by break on 2017/3/24.
 */

public class MatchDetermineTest {
    @Test
    public void test_RockToRock() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int rock = 1;
        assertEquals(Match.Draw, determine.determine(rock, rock));
    }

    @Test
    public void test_RockToPaper() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int rock = 1, paper = 2;
        assertEquals(Match.Lose, determine.determine(rock, paper));
    }

    @Test
    public void test_RockToScissors() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int rock = 1, scissors = 0;
        assertEquals(Match.Win, determine.determine(rock, scissors));
    }

    @Test
    public void test_ScissorsToScissors() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int scissors = 0;
        assertEquals(Match.Draw, determine.determine(scissors, scissors));
    }

    @Test
    public void test_ScissorsToRock() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int rock = 1, scissors = 0;
        assertEquals(Match.Lose, determine.determine(scissors, rock));
    }

    @Test
    public void test_ScissorsToPaper() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int paper = 2, scissors = 0;
        assertEquals(Match.Win, determine.determine(scissors, paper));
    }

    @Test
    public void test_PaperToScissors() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int paper = 2, scissors = 0;
        assertEquals(Match.Lose, determine.determine(paper, scissors));
    }

    @Test
    public void test_PaperToRock() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int rock = 1, paper = 2;
        assertEquals(Match.Win, determine.determine(paper, rock));
    }

    @Test
    public void test_PaperToPaper() throws Exception {
        MatchDetermine determine = new MatchDetermine();
        int paper = 2;
        assertEquals(Match.Draw, determine.determine(paper, paper));
    }
}
