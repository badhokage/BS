package com.example.bs;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        Button buttonChangeTextColor = findViewById(R.id.buttonChangeTextColor);

        TextView textView = findViewById(R.id.textView);

        buttonChangeText.setOnClickListener(v -> {
            textView.setText("The button was clicked!");
        });

        buttonChangeTextColor.setOnClickListener(v -> {
            textView.setTextColor(Color.RED);
        });

        Button buttonChangeBackground =
                findViewById(R.id.buttonChangeBackground);

        buttonChangeBackground.setOnClickListener(v -> {
            getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
        });
    }
}

//Code for revert