package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void resetScore(android.view.View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

     /**
     * Displays the given score for Team A.
     */
  public void displayForTeamA(int score) {
    android.widget.TextView scoreView = (android.widget.TextView) findViewById(R.id.team_a_score);
    scoreView.setText(String.valueOf(score));
  }

  /* this method adds 3 points to the score for team A
  * */
 public void addThreePointFotTeamA(android.view.View v) {
     scoreTeamA = scoreTeamA +3;
    displayForTeamA(scoreTeamA);

  }
   /* this method adds 2 points to the score for team A
  * */
   public void addTwoPointFotTeamA(android.view.View v) {
       scoreTeamA = scoreTeamA +2;
    displayForTeamA(scoreTeamA);

  }

   /* this method adds 1 points to the score for team A
  * */
   public void addOnePointFotTeamA(android.view.View v) {
       scoreTeamA = scoreTeamA +1;
    displayForTeamA(scoreTeamA);

  }
  /**
* Displays the given score for Team B.
*/
public void displayForTeamB(int score) {
 android.widget.TextView scoreView = (android.widget.TextView) findViewById(R.id.team_b_score);
 scoreView.setText(String.valueOf(score));
}
  /* this method adds 3 points to the score for team B
  * */
 public void addThreePointFotTeamB(android.view.View v) {
     scoreTeamB = scoreTeamB +3;
    displayForTeamB(scoreTeamB);

  }
   /* this method adds 2 points to the score for team B
  * */
   public void addTwoPointFotTeamB(android.view.View v) {
       scoreTeamB = scoreTeamB +2;
    displayForTeamB(scoreTeamB);

  }

   /* this method adds 1 points to the score for team B
  * */
   public void addOnePointFotTeamB(android.view.View v) {
       scoreTeamB = scoreTeamB +1;
    displayForTeamB(scoreTeamB);

  }

}
