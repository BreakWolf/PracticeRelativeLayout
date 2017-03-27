package com.myandroid.practicerelativelayout;

/**
 * Created by break on 2017/3/23.
 */

class RPSDefine {
    public String toString(int i) throws Exception {
        if (i < 0) {
            throw new Exception();
        }
        else{
            switch(i% 3){
                case 0:
                    return "剪刀";
                case 1:
                    return "石頭";
                case 2:
                    return "布";
                default:
                    return "";
            }

        }
    }
}
