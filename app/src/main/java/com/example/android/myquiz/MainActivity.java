package com.example.android.myquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView subTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface triforceFont = Typeface.createFromAsset(getAssets(), "fonts/triforce.ttf");

        title = (TextView) findViewById(R.id.quizTheme);
        title.setTypeface(triforceFont);

        subTitle = (TextView) findViewById(R.id.quizSubtitle);
        subTitle.setTypeface(triforceFont);
    }


    /**
     * This method is called when the 'Take This!' button is clicked to compile the quiz results
     * A local variable (quizScore) is used to hold the score value.
     * The Views use a naming convention appended with two letters to indicate the type of view
     *      rb = RadioButton
     *      cb = CheckBox
     *      et = EditText
     */
    public void quizResults(View view) {

        int quizScore = 0;

        //The correct response for question 1 is Zelda's Lullaby (C).
        RadioButton answerQuestionOne = (RadioButton) findViewById(R.id.question1_AnswerC_rb);
        boolean questionOneAnswerC = answerQuestionOne.isChecked();
        if (questionOneAnswerC) {
            quizScore += 1;
        }

        //These are the correct responses for question 2: A, D, F
        CheckBox answerQuestionTwoCheckboxA = (CheckBox) findViewById(R.id.question2_AnswerA_cb);
        boolean questionTwoAnswerA = answerQuestionTwoCheckboxA.isChecked();
        CheckBox answerQuestionTwoCheckboxB = (CheckBox) findViewById(R.id.question2_AnswerB_cb);
        boolean questionTwoAnswerB = answerQuestionTwoCheckboxB.isChecked();
        CheckBox answerQuestionTwoCheckboxC = (CheckBox) findViewById(R.id.question2_AnswerC_cb);
        boolean questionTwoAnswerC = answerQuestionTwoCheckboxC.isChecked();
        CheckBox answerQuestionTwoCheckboxD = (CheckBox) findViewById(R.id.question2_AnswerD_cb);
        boolean questionTwoAnswerD = answerQuestionTwoCheckboxD.isChecked();
        CheckBox answerQuestionTwoCheckboxE = (CheckBox) findViewById(R.id.question2_AnswerE_cb);
        boolean questionTwoAnswerE = answerQuestionTwoCheckboxE.isChecked();
        CheckBox answerQuestionTwoCheckboxF = (CheckBox) findViewById(R.id.question2_AnswerF_cb);
        boolean questionTwoAnswerF = answerQuestionTwoCheckboxF.isChecked();
        if (questionTwoAnswerA && !questionTwoAnswerB && !questionTwoAnswerC && questionTwoAnswerD && !questionTwoAnswerE && questionTwoAnswerF) {
            quizScore += 1;
        }

        //The correct response for question 3 is 50 (C).
        RadioButton answerQuestionThree = (RadioButton) findViewById(R.id.question3_AnswerC_rb);
        boolean questionThreeAnswerC = answerQuestionThree.isChecked();
        if (questionThreeAnswerC) {
            quizScore += 1;
        }

        //The correct response for question 4 is Courage (B).
        RadioButton answerQuestionFour = (RadioButton) findViewById(R.id.question4_AnswerB_rb);
        boolean questionFourAnswerB = answerQuestionFour.isChecked();
        if (questionFourAnswerB) {
            quizScore += 1;
        }

        //The correct response for question 5 is 8 (D).
        RadioButton answerQuestionFive = (RadioButton) findViewById(R.id.question5_AnswerD_rb);
        boolean questionFiveAnswerD = answerQuestionFive.isChecked();
        if (questionFiveAnswerD) {
            quizScore += 1;
        }

        //The correct response for question 6 is Octorok (A).
        RadioButton answerQuestionSix = (RadioButton) findViewById(R.id.question6_AnswerA_rb);
        boolean questionSixAnswerA = answerQuestionSix.isChecked();
        if (questionSixAnswerA) {
            quizScore += 1;
        }

        //The correct response for question 7 is 'Cucco'
        EditText questionSevenEditText = (EditText) findViewById(R.id.question7_AnswerA_et);
        String color = questionSevenEditText.getText().toString();
        if (color.equalsIgnoreCase("cucco")) {
            quizScore += 1;
        }

        if (quizScore == 7){
            Toast.makeText(this, "You answered all " + quizScore + " correctly!?  \nYou must be the Hero of Time!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You answered " + quizScore + " correctly out 7!  \nThanks for playing!", Toast.LENGTH_SHORT).show();
        }
    }
}
