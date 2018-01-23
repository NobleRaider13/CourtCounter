package com.example.regal360.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int teamAFouls = 0;
    int teamBFouls = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */

    public void addOneForTeamA(View v){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the number of fouls for Team A.
     */

    public void foulsForTeamA(View v){
        teamAFouls +=1;
        displayFoulForTeamA(teamAFouls);

    }

    /**
     * Displays the given score for Team B.
     */

    public void addOneForTeamB(View v){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the number of fouls for Team B.
     */

    public void foulsForTeamB(View v){
        teamBFouls +=1;
        displayFoulForTeamB(teamBFouls);

    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        teamAFouls = 0;
        teamBFouls = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(teamAFouls);
        displayFoulForTeamB(teamBFouls);

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
    /**
     * Displays number of fouls for Team A.
     */
    public void displayFoulForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.FoulTeamA);
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * Displays number of fouls for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.FoulTeamB);
        scoreView.setText(String.valueOf(foul));
    }

}
