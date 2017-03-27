package com.myandroid.practicerelativelayout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by break on 2017/3/23.
 */

public class IntToStringUnitTest {
    @Test
    public void defineIntToStringPair_0() throws Exception {
        RPSDefine def = new RPSDefine();
        assertEquals("剪刀", def.toString(0));
    }

    @Test
    public void defineIntToStringPair_1() throws Exception {
        RPSDefine def = new RPSDefine();
        assertEquals("石頭", def.toString(1));
    }

    @Test
    public void defineIntToStringPair_2() throws Exception {
        RPSDefine def = new RPSDefine();
        assertEquals("布", def.toString(2));
    }

    @Test
    public void defineIntToStringPairBorder_3() throws Exception {
        RPSDefine def = new RPSDefine();
        assertEquals("剪刀", def.toString(3));
    }

    @Test(expected = Exception.class)
    public void defineIntToStringPairBorder_0() throws Exception {
        RPSDefine def = new RPSDefine();
        assertEquals("", def.toString(-20));
    }
}
