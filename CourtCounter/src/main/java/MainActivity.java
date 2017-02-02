package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int startingScoreA = 0;
    int startingScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointerA(View view){
        startingScoreA = startingScoreA + 3;
        displayForTeamA(startingScoreA);
    }

    public void twoPointerA(View view){
        startingScoreA = startingScoreA + 2;
        displayForTeamA(startingScoreA);
    }

    public void freeThrowA(View view){
        startingScoreA = startingScoreA + 1;
        displayForTeamA(startingScoreA);
    }

    public void threePointerb(View view){
        startingScoreB = startingScoreB + 3;
        displayForTeamB(startingScoreB);
    }

    public void twoPointerB(View view){
        startingScoreB = startingScoreB + 2;
        displayForTeamB(startingScoreB);
    }

    public void freeThrowB(View view){
        startingScoreB = startingScoreB + 1;
        displayForTeamB(startingScoreB);
    }

    public void reset(View v){
        startingScoreA = 0;
        startingScoreB = 0;
        displayForTeamA(startingScoreA);
        displayForTeamB(startingScoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}



