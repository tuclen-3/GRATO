package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.grato_gv.Adapter.ExamCodeAdapter;
import com.example.grato_gv.Adapter.ReviewQuizScanAdapter;
import com.example.grato_gv.Model.ExamCode;
import com.example.grato_gv.Model.QuizScanReview;
import com.example.grato_gv.Model.Student;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class ReviewQuizScanActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView reviewQuizScanRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_quiz_scan);

        addControls();
        addEvents();
    }

    @Override
    protected void onStart() {
        super.onStart();

        getData();
    }

    private void getData() {
        ArrayList<QuizScanReview> lstQuizScanReview = new ArrayList<>();
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Đỗ Mỹ Linh", "1812209"),
                new ExamCode("001", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Nguyễn Xuân Tiến", "1814523"),
                new ExamCode("002", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("H'Hen Niê", "1814456"),
                new ExamCode("003", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Cao Xuân Tài", "1812322"),
                new ExamCode("001", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Đỗ Mỹ Linh", "1812209"),
                new ExamCode("001", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Nguyễn Xuân Tiến", "1814523"),
                new ExamCode("002", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("H'Hen Niê", "1814456"),
                new ExamCode("003", null),
                9.00)
        );
        lstQuizScanReview.add(new QuizScanReview(
                new Student("Cao Xuân Tài", "1812322"),
                new ExamCode("001", null),
                9.00)
        );

        // tạo adapter
        ReviewQuizScanAdapter reviewQuizScanAdapter = new ReviewQuizScanAdapter(lstQuizScanReview);

        // performance
        reviewQuizScanRecyclerview.setHasFixedSize(true);

        // set adapter cho Recycler View
        reviewQuizScanRecyclerview.setAdapter(reviewQuizScanAdapter);
    }

    private void addEvents() {
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true); // icon

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControls() {
        toolbar = findViewById(R.id.reviewQuizScanToolbar);
        reviewQuizScanRecyclerview = findViewById(R.id.reviewQuizScanItemRecyclerview);
    }
}