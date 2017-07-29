package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void check(View view){
        RadioButton radioButton = (RadioButton) findViewById(R.id.right_radio);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.check1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.check2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.check3);
        EditText editText1 = (EditText) findViewById(R.id.edit_text_1);
        EditText editText2 = (EditText) findViewById(R.id.edit_text_2);
        final TextView scoreView = (TextView) findViewById(R.id.score_text);
        if(radioButton.isChecked()){
            score = score + 5 ;
        }
        if(checkBox1.isChecked()){
            score = score + 5 ;
        }
        if(checkBox2.isChecked()){
            score = score + 5 ;
        }
        if(checkBox3.isChecked()){
            score = score + 5 ;
        }
        if(editText1.getText().toString().equalsIgnoreCase("asia")){
            score = score + 5 ;
        }
        if(editText2.getText().toString().equalsIgnoreCase("16")){
            score = score + 5 ;
        }
        scoreView.setText("Your score= " + score + "/30");
        score = 0;
    }
}
