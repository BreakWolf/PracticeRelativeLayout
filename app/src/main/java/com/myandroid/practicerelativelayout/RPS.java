package com.myandroid.practicerelativelayout;

/**
 * Created by break on 2017/3/23.
 */

class RPS {
    private int settedRound = 0;
    private boolean setted = false;

    public int getRound() {
        if(setted) {
            return settedRound % 3;
        }
        else {
            return (int) (Math.random() * 3);
        }
    }

    public void setRound(int setRound) throws Exception{
        if(setRound < 0) {
            throw new Exception();
        }
        this.settedRound = setRound;
        this.setted = true;
    }
}
