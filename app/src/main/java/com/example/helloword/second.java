package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
    String takeExtra;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt = findViewById(R.id.txtmMessage);

        Intent myIntent = getIntent();
        takeExtra = myIntent.getStringExtra("MAIN_EXTRA");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        txt.setText(takeExtra);
    }
} 