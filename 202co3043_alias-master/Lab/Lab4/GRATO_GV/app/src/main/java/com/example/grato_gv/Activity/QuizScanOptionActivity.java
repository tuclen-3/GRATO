package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.grato_gv.R;

public class QuizScanOptionActivity extends AppCompatActivity {

    Toolbar quizScanOptionToolbar;
    CardView keyOption, scanpapersOption, reviewpapersOption, analysisOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_scan_option);

        addControls();
        addEvents();


    }

    private void addEvents() {
        setSupportActionBar(quizScanOptionToolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true); // icon

        quizScanOptionToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        keyOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizScanOptionActivity.this, ExamCodeActivity.class);
                startActivity(intent);
            }
        });

        scanpapersOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizScanOptionActivity.this, ViewScanActivity.class);
                startActivity(intent);
            }
        });

        reviewpapersOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizScanOptionActivity.this, ReviewQuizScanActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        quizScanOptionToolbar = findViewById(R.id.quizScanOptionToolbar);
        keyOption = findViewById(R.id.keyOption);
        scanpapersOption = findViewById(R.id.scanpapersOption);
        reviewpapersOption = findViewById(R.id.reviewpapersOption);
        analysisOption = findViewById(R.id.analysisOption);

    }
}