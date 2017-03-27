package com.myandroid.practicerelativelayout;

/**
 * Created by break on 2017/3/24.
 */

class MatchDetermine {
    public Match determine(int from, int to) {
        if(from == 0 && to == 2){
            return Match.Win;
        }
        if(from == 2 && to == 0){
            return Match.Lose;
        }
        if(from == to){
            return Match.Draw;
        }
        if(from < to){
            return Match.Lose;
        }

        return Match.Win;
    }
}
