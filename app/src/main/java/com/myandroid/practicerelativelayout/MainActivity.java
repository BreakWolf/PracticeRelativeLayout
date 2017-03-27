package com.myandroid.practicerelativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.regex.MatchResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onbtnScissorsClick(View view) throws Exception {
        match(0);
    }

    protected void onbtnStoneClick(View view) throws Exception {
        match(1);
    }

    protected void onbtnPaperClick(View view) throws Exception {
        match(2);
    }

    private void match(int playClick) throws Exception {
        RPS rps = new RPS();
        MatchDetermine determine = new MatchDetermine();
        int com = rps.getRound();
        Match res = determine.determine(playClick, com);
        showResult(com, res);
    }

    private void showResult(int com, Match res) throws Exception{
        String resString = getString(R.string.result);
        RPSDefine define = new RPSDefine();
        TextView txtCom = (TextView)findViewById(R.id.txtComPlay);
        TextView txtRes = (TextView)findViewById(R.id.txtResult);
        txtCom.setText(define.toString(com));
        switch(res){
            case Win:
                resString += getString(R.string.player_win);
                break;
            case Lose:
                resString += getString(R.string.player_lose);
                break;
            case Draw:
                resString += getString(R.string.player_draw);
                break;
        }

        txtRes.setText(resString);
    }

}
