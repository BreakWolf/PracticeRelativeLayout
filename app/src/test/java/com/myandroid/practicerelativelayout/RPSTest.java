package com.myandroid.practicerelativelayout;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by break on 2017/3/23.
 */

public class RPSTest {
    @Test
    public void testRandomRange()  {
        RPS rps = new RPS();
        assertTrue(rps.getRound() < 3 && rps.getRound() >= 0);
    }

    @Test
    public void testSetRange_happyPath() throws Exception {
        RPS rps = new RPS();
        int setRound = 1;
        rps.setRound(setRound);
        assertEquals(setRound, rps.getRound());
    }

    @Test
    public void testSetRange_greater2() throws Exception {
        RPS rps = new RPS();
        int setRound = 3;
        rps.setRound(setRound);
        assertEquals(0, rps.getRound());
    }

    @Test(expected = Exception.class)
    public void testSetRange_smaller0() throws Exception {
        RPS rps = new RPS();
        int setRound = -1;
        rps.setRound(setRound);
    }
}
