package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static com.example.android.quizapp.R.id.q1false;
import static com.example.android.quizapp.R.id.q1true;

public class MainActivity extends AppCompatActivity {

    private int scoreView = 0;
    private Button q1true;
    private Button q1false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1true = (Button) findViewById(R.id.q1true);
        q1false = (Button) findViewById(R.id.q1false);


        q1true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        q1false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

        /**
         * Displays the Final score
         */
        public void scoreView(int score) {
            TextView scoreView = (TextView) findViewById(R.id.scoreView);
            scoreView.setText(String.valueOf(score));

        }

    }
