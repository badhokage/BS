package com.example.bs;

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
        TextView textView = findViewById(R.id.textView);

        buttonChangeText.setOnClickListener(v -> {
            textView.setText("The button was clicked!");
        });
    }
}