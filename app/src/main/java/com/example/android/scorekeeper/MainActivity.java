package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addOneForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }

    public void addFourForTeamA (View view) {
        scoreTeamA = scoreTeamA + 4 ;
        displayForTeamA(scoreTeamA);
    }

    public void addFiveForTeamA (View view) {
        scoreTeamA = scoreTeamA + 5 ;
        displayForTeamA(scoreTeamA);
    }

    public void addSixForTeamA (View view) {
        scoreTeamA = scoreTeamA + 6 ;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    public void addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }
    public void addFourForTeamB (View view) {
        scoreTeamB = scoreTeamB + 4 ;
        displayForTeamB(scoreTeamB);
    }
    public void addFiveForTeamB (View view) {
        scoreTeamB = scoreTeamB + 5 ;
        displayForTeamB(scoreTeamB);
    }
    public void addSixForTeamB (View view) {
        scoreTeamB = scoreTeamB + 6 ;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

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
