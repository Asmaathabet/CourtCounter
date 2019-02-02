package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0 ;
    int ScoreTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ADD one for the score in the team A

    public void addOneForTeamA (View v){
        ScoreTeamA = ScoreTeamA +1 ;
        displayForTeamA(ScoreTeamA);
    }
    // ADD two for the score in the team A

    public void addTwoForTeamA (View v){
        ScoreTeamA = ScoreTeamA +2 ;
        displayForTeamA(ScoreTeamA);
    }
    // ADD three for the score in the team A

    public void addThreeForTeamA (View v){
        ScoreTeamA = ScoreTeamA +3 ;
        displayForTeamA(ScoreTeamA);
    }

    // ADD one for the score in the team B

    public void addOneForTeamB (View v){
        ScoreTeamB = ScoreTeamB +1 ;
        displayForTeamB(ScoreTeamB);
    }
    // ADD two for the score in the team B


    public void addTwoForTeamB (View v){
        ScoreTeamB = ScoreTeamB +2 ;
        displayForTeamB(ScoreTeamB);
    }

    // ADD three for the score in the team B

    public void addThreeForTeamB (View v){
        ScoreTeamB = ScoreTeamB +3 ;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * RESET The Scores For both Teams back to zero
     */

    public void resetScore(View v) {
        displayForTeamA(0);
        displayForTeamB(0);
         ScoreTeamA = 0 ;
         ScoreTeamB = 0 ;

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
