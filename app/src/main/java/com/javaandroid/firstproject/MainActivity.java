package com.javaandroid.firstproject;

import static java.lang.Math.pow;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onButtonClick(View sender) {
        EditText inputField = findViewById(R.id.editTextNumber);
        EditText outputField = findViewById(R.id.editTextNumber2);
        String text = inputField.getText().toString();
        double kilometers = Double.parseDouble(text);
        double miles = kilometers * 0.621371;
        outputField.setText(String.valueOf(miles));
    }
    public void onButton2Click(View sender) {
        EditText inputField = findViewById(R.id.editTextNumber7);
        EditText outputField = findViewById(R.id.editTextNumber8);
        String text = inputField.getText().toString();
        double radius = Double.parseDouble(text);
        double area = 3.1416 * pow(radius,2);
        outputField.setText(String.valueOf(area));
    }
}