package com.cs407.lab2_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addFunction(View view){
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2 = (EditText) findViewById(R.id.editTextText2);

        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
        }else{
            int value1 = Integer.parseInt(number1.getText().toString());
            int value2 = Integer.parseInt(number2.getText().toString());

            // Perform addition
            int result = value1 + value2;

            goToActivity(Integer.toString(result));
        }
    }
    public void subtractFunction(View view){
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2 = (EditText) findViewById(R.id.editTextText2);

        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
        }else{
            int value1 = Integer.parseInt(number1.getText().toString());
            int value2 = Integer.parseInt(number2.getText().toString());

            // Perform addition
            int result = value1 - value2;

            goToActivity(Integer.toString(result));
        }

    }
    public void multiplicationFunction(View view){
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2 = (EditText) findViewById(R.id.editTextText2);

        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
        }else{
            int value1 = Integer.parseInt(number1.getText().toString());
            int value2 = Integer.parseInt(number2.getText().toString());

            // Perform addition
            int result = value1 * value2;

            goToActivity(Integer.toString(result));
        }
    }
    public void divisionFunction(View view){
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2 = (EditText) findViewById(R.id.editTextText2);

        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
        } else if (number2.getText().toString().equals("0")) {
            Toast.makeText(MainActivity.this, "Can't divide by 0", Toast.LENGTH_LONG).show();
        } else{
            int value1 = Integer.parseInt(number1.getText().toString());
            int value2 = Integer.parseInt(number2.getText().toString());

            // Perform addition
            double result = (double) value1 / value2;

            goToActivity(Double.toString(result));
        }


    }
    public void goToActivity(String s){
        Intent intent = new Intent(this, calc_result.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}