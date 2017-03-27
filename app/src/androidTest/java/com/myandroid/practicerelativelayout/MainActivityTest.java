package com.myandroid.practicerelativelayout;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by break on 2017/3/24.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    public MainActivityTest(){

    }

    @Test
    public void test_playScissors(){
        try{
            onView(withId(R.id.btnScissors)).perform(click());
            String playCom = ((TextView)mActivityRule.getActivity().findViewById(R.id.txtComPlay)).getText().toString();

            if(playCom == "剪刀"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：雙方平手")));
            }
            else if( playCom == "石頭"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：很可惜，你輸了。")));
            }
            else{
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：恭喜，你贏了！")));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test_playRock(){
        try
        {
            onView(withId(R.id.btnStone))
                    .perform(click());
            String playCom = ((TextView)mActivityRule.getActivity().findViewById(R.id.txtComPlay)).getText().toString();

            if(playCom == "剪刀"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：恭喜，你贏了！")));
            }
            else if( playCom == "石頭"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：雙方平手")));
            }
            else{
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：很可惜，你輸了。")));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test_playPaper(){
        try{
            onView(withId(R.id.btnPaper))
                    .perform(click());
            String playCom = ((TextView)mActivityRule.getActivity().findViewById(R.id.txtComPlay)).getText().toString();

            if(playCom == "剪刀"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：很可惜，你輸了。")));
            }
            else if( playCom == "石頭"){
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：恭喜，你贏了！")));
            }
            else{
                onView(withId(R.id.txtResult))
                        .check(matches(withText("判定輸贏：雙方平手")));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
