package com.example.android.quizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * keeps track of correct answers
     */
    private int correct = 0;
    private int incorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton LargestRailwayStation = findViewById(R.id.largest_railway_station);
        final RadioButton HighestRailwayStation = findViewById(R.id.highest_railway_station);
        final RadioButton LongestRailwayStation = findViewById(R.id.longest_railway_station);
        final EditText egyptianPyramidEditText = findViewById(R.id.egyPyr);
        final CheckBox cb1CheckBox = findViewById(R.id.cb1);
        final CheckBox cb2CheckBox = findViewById(R.id.cb2);
        final CheckBox cb3CheckBox = findViewById(R.id.cb3);
        final RadioButton asiaRadioButton = findViewById(R.id.asia);
        final RadioButton africaRadioButton = findViewById(R.id.africa);
        final RadioButton heatRadioButton = findViewById(R.id.heat);
        final RadioButton energyRadioButton = findViewById(R.id.energy);
        final RadioButton drinkingAlcoholKillsRadioButton = findViewById(R.id.alKillsT);
        final RadioButton drinkingAlcoholDoesnotKillRadioButton = findViewById(R.id.alKillsF);
        final CheckBox checkBox1CheckBox = findViewById(R.id.physics_chemistry);
        final CheckBox checkBox2CheckBox = findViewById(R.id.physiology_medicine);
        final CheckBox checkBox3CheckBox = findViewById(R.id.literature_peace_economics);
        final EditText partyNameEditText = findViewById(R.id.partyName);
        final EditText htmlEditText = findViewById(R.id.htmlStandsFor);
        final RadioButton bacteriaRadioButton = findViewById(R.id.bacteria);
        final RadioButton mosquitoRadioButton = findViewById(R.id.mosquito);
        final RadioButton virusRadioButton = findViewById(R.id.virus);
        // All the questions and the score are reset via the reset button
        Button resetButton = findViewById(R.id.resetButton);
        // Process the button onclick event
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LargestRailwayStation.setChecked(false);
                HighestRailwayStation.setChecked(false);
                LongestRailwayStation.setChecked(false);
                egyptianPyramidEditText.setText("");
                cb1CheckBox.setChecked(false);
                cb2CheckBox.setChecked(false);
                cb3CheckBox.setChecked(false);
                asiaRadioButton.setChecked(false);
                africaRadioButton.setChecked(false);
                heatRadioButton.setChecked(false);
                energyRadioButton.setChecked(false);
                drinkingAlcoholKillsRadioButton.setChecked(false);
                drinkingAlcoholDoesnotKillRadioButton.setChecked(false);
                checkBox1CheckBox.setChecked(false);
                checkBox2CheckBox.setChecked(false);
                checkBox3CheckBox.setChecked(false);
                partyNameEditText.setText("");
                htmlEditText.setText("");
                bacteriaRadioButton.setChecked(false);
                mosquitoRadioButton.setChecked(false);
                virusRadioButton.setChecked(false);
            }
        });
    }

    /**
     * If question 1 is correct
     */
    public void question1() {
        RadioButton grandCenTerm = findViewById(R.id.largest_railway_station);
        if (grandCenTerm.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 2 is correct
     */
    public void question2() {
        EditText egyPyrEditText = findViewById(R.id.egyPyr);
        Editable egyPyrResult = egyPyrEditText.getText();
        if (egyPyrResult.length() != 0 && egyPyrResult.toString().toLowerCase().equals("giza")) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 3 is correct
     */
    public void question3() {
        CheckBox cb1 = findViewById(R.id.cb1);
        CheckBox cb2 = findViewById(R.id.cb2);
        CheckBox cb3 = findViewById(R.id.cb3);

        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 4 is correct
     */
    public void question4() {
        RadioButton eriCont = findViewById(R.id.africa);
        if (eriCont.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 5 is correct
     */
    public void question5() {
        RadioButton joule = findViewById(R.id.energy);
        if (joule.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 6 is correct
     */
    public void question6() {
        RadioButton drinkingAlcohol = findViewById(R.id.alKillsF);
        if (drinkingAlcohol.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 7 is correct
     */
    public void question7() {
        CheckBox checkBox1 = findViewById(R.id.physics_chemistry);
        CheckBox checkBox2 = findViewById(R.id.physiology_medicine);
        CheckBox checkBox3 = findViewById(R.id.literature_peace_economics);

        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 8 is correct
     */
    public void question8() {
        EditText partyNameEditText = findViewById(R.id.partyName);
        Editable partyNameResult = partyNameEditText.getText();
        if (partyNameResult.length() != 0 && partyNameResult.toString().toLowerCase().equals("nazi")) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 9 is correct
     */
    public void question9() {
        EditText htmlEditText = findViewById(R.id.htmlStandsFor);
        Editable htmlResult = htmlEditText.getText();
        if (htmlResult.length() != 0 && htmlResult.toString().toLowerCase().equals("hypertext markup language")) {
            correct++;
        } else {
            incorrect++;
        }
    }

    /**
     * If question 10 is correct
     */
    public void question10() {
        RadioButton filaria = findViewById(R.id.mosquito);
        if (filaria.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }
    }

    private void calculateResult() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
    }

    /**
     * Total of correct answers after the submit button is clicked
     */
    public void scoreButton(View view) {
        correct = 0;
        incorrect = 0;
        calculateResult();
        String result = "You got " + correct + "/10 correct! and " + incorrect + " incorrect. ";
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}



