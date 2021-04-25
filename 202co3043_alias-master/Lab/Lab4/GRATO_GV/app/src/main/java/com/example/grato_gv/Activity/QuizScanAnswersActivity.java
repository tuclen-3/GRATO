package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.grato_gv.Adapter.ExamCodeAdapter;
import com.example.grato_gv.Adapter.QuizScanAnswersAdapter;
import com.example.grato_gv.Model.ExamCode;
import com.example.grato_gv.R;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizScanAnswersActivity extends AppCompatActivity {

    Toolbar answersToolbar;
    TextView tvExamCodeId;
    RecyclerView quizScanAnswersRecyclerview;
    ListView quizScanAnswersListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_scan_answers);

        addControls();
        addEvents();
    }

    @Override
    protected void onStart() {
        super.onStart();

        getData();
    }

    private void getData() {

        // tạo adapter
        QuizScanAnswersAdapter quizScanAnswersAdapter = new QuizScanAnswersAdapter("ABABBABBCBBCBDBBBBBEBBBDBDBCEBDBD");

        // performance
        quizScanAnswersRecyclerview.setHasFixedSize(true);

        // set adapter cho Recycler View
        quizScanAnswersRecyclerview.setAdapter(quizScanAnswersAdapter);

    }

    private void addEvents() {
        setSupportActionBar(answersToolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true); // icon

        answersToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControls() {
        answersToolbar = findViewById(R.id.answersToolbar);
        tvExamCodeId = findViewById(R.id.tvExamCodeId);
        quizScanAnswersRecyclerview = findViewById(R.id.quizScanAnswersRecyclerview);
    }
}