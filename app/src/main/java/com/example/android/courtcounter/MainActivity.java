package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreForTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addOneForTeamA(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View view){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /*team b */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addOneForTeamB(View view){
        scoreForTeamB=scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }
    public void addTwoForTeamB(View view){
        scoreForTeamB=scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);
    }
    public void addThreeForTeamB(View view){
        scoreForTeamB=scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);
    }

    public void reset(View v){
        scoreForTeamB=0;
        scoreTeamA=0;
        displayForTeamB(scoreForTeamB);
        displayForTeamA(scoreTeamA);
    }
}
