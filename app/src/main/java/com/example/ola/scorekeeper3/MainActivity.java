package com.example.ola.scorekeeper3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Setting global variables
    // Tracks the score for Team A
    int goalsTeamA = 0;
    int yellowsTeamA = 0;
    int redsTeamA = 0;
    int foulsTeamA = 0;

    // Tracks the score for Team B
    int goalsTeamB = 0;
    int yellowsTeamB = 0;
    int redsTeamB = 0;
    int foulsTeamB = 0;

    // Main layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Creating menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Invoked when the activity may be temporarily destroyed, save the instance state here
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("goalsTeamA", goalsTeamA);
        outState.putInt("yellowsTeamA", yellowsTeamA);
        outState.putInt("redsTeamA", redsTeamA);
        outState.putInt("foulsTeamA", foulsTeamA);
        outState.putInt("goalsTeamB", goalsTeamB);
        outState.putInt("yellowsTeamB", yellowsTeamB);
        outState.putInt("redsTeamB", redsTeamB);
        outState.putInt("foulsTeamB", foulsTeamB);
        // Call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

    // onRestoreInstanceState() is called only if there is a saved state to restore
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Restore state members from saved instance
        goalsTeamA = savedInstanceState.getInt("goalsTeamA");
        yellowsTeamA = savedInstanceState.getInt("yellowsTeamA");
        redsTeamA = savedInstanceState.getInt("redsTeamA");
        foulsTeamA = savedInstanceState.getInt("foulsTeamA");
        goalsTeamB = savedInstanceState.getInt("goalsTeamB");
        yellowsTeamB = savedInstanceState.getInt("yellowsTeamB");
        redsTeamB = savedInstanceState.getInt("redsTeamB");
        foulsTeamB = savedInstanceState.getInt("foulsTeamB");

        displayGoalsForTeamA(goalsTeamA);
        displayYellowsForTeamA(yellowsTeamA);
        displayRedsForTeamA(redsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayYellowsForTeamB(yellowsTeamB);
        displayRedsForTeamB(redsTeamB);
        displayFoulsForTeamB(foulsTeamB);

        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * Increase the number of goals for Team A by 1
     */
    public void addGoalForTeamA(View view) {
        goalsTeamA = goalsTeamA +1;
        displayGoalsForTeamA(goalsTeamA);
    }

    // Increase the number of yellow cards for Team A
    public void addYellowForTeamA(View view) {
        yellowsTeamA = yellowsTeamA +1;
        displayYellowsForTeamA(yellowsTeamA);
    }

    // Increase the number of red cards for Team A
    public void addRedForTeamA(View view) {
        redsTeamA =  redsTeamA +1;
        displayRedsForTeamA(redsTeamA);
    }

    // Increase the number of fouls for Team A
    public void addFoulForTeamA(View view) {
        foulsTeamA = foulsTeamA +1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the number of goals for Team B by 1
     */
    public void addGoalForTeamB(View view) {
        goalsTeamB = goalsTeamB +1;
        displayGoalsForTeamB(goalsTeamB);
    }

    // Increase the number of yellow cards for Team B
    public void addYellowForTeamB(View view) {
        yellowsTeamB = yellowsTeamB +1;
        displayYellowsForTeamB(yellowsTeamB);
    }

    // Increase the number of red cards for Team B
    public void addRedForTeamB(View view) {
        redsTeamB = redsTeamB +1;
        displayRedsForTeamB(redsTeamB);
    }

    // Increase the number of fouls for Team B
    public void addFoulForTeamB(View view) {
        foulsTeamB = foulsTeamB +1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team A
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays number of fouls for Team A
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_TeamA);
        scoreView.setText(String.valueOf(score));
    }
    // Displays number of yellow cards for Team A
    public void displayYellowsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_TeamA);
        scoreView.setText(String.valueOf(score));
    }

    // Displays number of red cards for Team A
    public void displayRedsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_TeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B
     */

    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays number of fouls for Team B
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    // Displays number of yellow cards for Team B
    public void displayYellowsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    // Displays number of red cards for Team B
    public void displayRedsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0
     */

    public void reset(View view){
        goalsTeamA = 0;
        yellowsTeamA = 0;
        redsTeamA = 0;
        foulsTeamA = 0;
        goalsTeamB = 0;
        yellowsTeamB = 0;
        redsTeamB = 0;
        foulsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayYellowsForTeamA(yellowsTeamA);
        displayRedsForTeamA(redsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayYellowsForTeamB(yellowsTeamB);
        displayRedsForTeamB(redsTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }


}

