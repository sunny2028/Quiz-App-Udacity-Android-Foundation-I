package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitTest(View view) {
        RadioButton amoebiasisRadio1 = (RadioButton) findViewById(R.id.amoebiasis_radio1);
        if (amoebiasisRadio1.isChecked()) {
            points++;
        }
        RadioButton dermatitisRadio2 = (RadioButton) findViewById(R.id.dermatitis_radio2);
        if (dermatitisRadio2.isChecked()) {
            points++;
        }
        RadioButton sixRadio3 = (RadioButton) findViewById(R.id.six_radio3);
        if (sixRadio3.isChecked()) {
            points++;
        }
        RadioButton bRadio4 = (RadioButton) findViewById(R.id.b_radio4);
        if (bRadio4.isChecked()) {
            points++;
        }
        EditText editText1 = (EditText) findViewById(R.id.edit_text1);
        EditText editText2 = (EditText) findViewById(R.id.edit_text2);
        String text1 = editText1.getText().toString().trim();
        String text2 = editText2.getText().toString().trim();
        if (text1.equals("Cornea") || text1.equals("cornea")) {
            points++;
        }
        if (text2.equals("Lipase") || text2.equals("lipase")) {
            points++;
        }
        CheckBox milkCheckbox1 = (CheckBox) findViewById(R.id.milk_checkbox1);
        CheckBox amlaCheckbox1 = (CheckBox) findViewById(R.id.amla_checkbox1);
        CheckBox lemonCheckbox1 = (CheckBox) findViewById(R.id.lemon_checkbox1);
        CheckBox greenChilliCheckbox1 = (CheckBox) findViewById(R.id.green_chilli_checkbox1);
        if (lemonCheckbox1.isChecked() && amlaCheckbox1.isChecked() && greenChilliCheckbox1.isChecked() && (!milkCheckbox1.isChecked())) {
            points++;
        }
        CheckBox aCheckbox2 = (CheckBox) findViewById(R.id.a_checkbox2);
        CheckBox bCheckbox2 = (CheckBox) findViewById(R.id.b_checkbox2);
        CheckBox cCheckbox2 = (CheckBox) findViewById(R.id.c_checkbox2);
        CheckBox dCheckbox2 = (CheckBox) findViewById(R.id.d_checkbox2);
        if (aCheckbox2.isChecked() && bCheckbox2.isChecked() && cCheckbox2.isChecked() && (!dCheckbox2.isChecked())) {
            points++;
        }
        if (points > 4) {
            Toast.makeText(this, "Congratulations! \nScore = " + points, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Work Hard! \nScore = " + points, Toast.LENGTH_SHORT).show();
        }
        points = 0;
    }
}
