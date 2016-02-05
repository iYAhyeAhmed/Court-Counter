package com.galbal.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Global variables are defined and initialized here.
    int ScoreTotalTA = 0;
    int ScoreTotalTB = 0;

    // increases Score total of team a by 3
    public void points3TA (View view){
        ScoreTotalTA +=3;
        displayForTeamA(ScoreTotalTA);
    }

    // increases Score total of team a by 2
    public void points2TA(View view){
        ScoreTotalTA+=2;
        displayForTeamA(ScoreTotalTA);
    }

    // increases Score total of team a by 1
    public void points1TA(View view){
        ScoreTotalTA+=1;
        displayForTeamA(ScoreTotalTA);
    }



    // increases Score total of team b by 3
    public void points3TB (View view){
        ScoreTotalTB += 3;
        displayForTeamB(ScoreTotalTB);
    }

    // increases Score total of team b by 2
    public void points2TB(View view){
        ScoreTotalTB += 2;
        displayForTeamB(ScoreTotalTB);
    }

    // increases Score total of team b by 2
    public void points1TB(View view){
        ScoreTotalTB += 1;
        displayForTeamB(ScoreTotalTB);
    }

    public void reset(View view){
        ScoreTotalTA = 0;
        ScoreTotalTB = 0;
        displayForTeamA(ScoreTotalTA);
        displayForTeamB(ScoreTotalTB);
    }
    // this is method to show values of ScoreTotal Team A on screen.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // this is method to show values of ScoreTotal Team A on screen.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
