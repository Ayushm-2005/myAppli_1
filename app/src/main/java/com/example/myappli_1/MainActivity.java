package com.example.myappli_1; // ur project name

import android.graphics.Color;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ComponentActivity {
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(v -> {
            textView.setTextSize(font);
            font += 5;
            if (font == 50) {
                font = 30;
            }
        });

        button2.setOnClickListener(v -> {
            // Change text color here
            textView.setTextColor(Color.RED);
        });
    }
}
