package com.androiddev.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button submitButton;
    CheckBox checkBoxApple,checkBoxMango,checkBoxGrapes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textView_result);
        submitButton = findViewById(R.id.button_submit);
        checkBoxApple = findViewById(R.id.checkbox_apple);
        checkBoxGrapes = findViewById(R.id.checkbox_grapes);
        checkBoxMango = findViewById(R.id.checkbox_mango);


    }
    public void onClick(View view){

        if(checkBoxApple.isChecked() && checkBoxMango.isChecked() && checkBoxGrapes.isChecked()){
            result.setText(getResources().getString(R.string.selectedAll));
        }
        else if(checkBoxApple.isChecked() && checkBoxMango.isChecked()){
            result.setText(getResources().getString(R.string.selectedAppleAndMango));
        }
        else if(checkBoxApple.isChecked() && checkBoxGrapes.isChecked()){
            result.setText(getResources().getString(R.string.selectedAppleAndGrapes));
        }
        else  if(checkBoxMango.isChecked() && checkBoxGrapes.isChecked()){
            result.setText(getResources().getString(R.string.selectedMangoAndGrapes));
        }
        else if(checkBoxApple.isChecked()){
            result.setText(getResources().getString(R.string.selectedApple));
        }
        else if(checkBoxGrapes.isChecked()){
            result.setText(getResources().getString(R.string.selectedGrapes));
        }
        else if(checkBoxMango.isChecked()){
            result.setText(getResources().getString(R.string.selectedGrapes));
        }
        else {
            result.setText(getResources().getString(R.string.selectedNothing));
        }
    }
}