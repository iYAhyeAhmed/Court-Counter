package com.galbal.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global variables are defined and initialized here.
    int ScoreTotalTA = 0;
    int ScoreTotalTB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = getIntent().getExtras();
        if (b == null) {
            return;
        } else {
            String str = b.getString("firstName");
            String strr = b.getString("secondName");
            TextView TeamA = (TextView) findViewById(R.id.TeamA);
            TextView TeamB = (TextView) findViewById(R.id.TeamB);
            TeamA.setText(str);
            TeamB.setText(strr);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

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
