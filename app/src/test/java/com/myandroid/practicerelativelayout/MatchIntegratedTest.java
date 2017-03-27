package com.myandroid.practicerelativelayout;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by break on 2017/3/24.
 */

public class MatchIntegratedTest {
    @Test
    public void testRound_playScissors(){
        int play = 0;
        RPS rps = new RPS();
        MatchDetermine deter = new MatchDetermine();
        int com = rps.getRound();

        if(com == 0){
            assertEquals(Match.Draw, deter.determine(play, com));
        }
        else if (com == 1){
            assertEquals(Match.Lose, deter.determine(play, com));
        }
        else {
            assertEquals(Match.Win, deter.determine(play, com));
        }
    }

    @Test
    public void testRound_playRock(){
        int play = 1;
        RPS rps = new RPS();
        MatchDetermine deter = new MatchDetermine();
        int com = rps.getRound();

        if(com == 0){
            assertEquals(Match.Win, deter.determine(play, com));
        }
        else if (com == 1){
            assertEquals(Match.Draw, deter.determine(play, com));
        }
        else {
            assertEquals(Match.Lose, deter.determine(play, com));
        }
    }

    @Test
    public void testRound_playPaper(){
        int play = 2;
        RPS rps = new RPS();
        MatchDetermine deter = new MatchDetermine();
        int com = rps.getRound();

        if(com == 0){
            assertEquals(Match.Lose, deter.determine(play, com));
        }
        else if (com == 1){
            assertEquals(Match.Win, deter.determine(play, com));
        }
        else {
            assertEquals(Match.Draw, deter.determine(play, com));
        }
    }
}
