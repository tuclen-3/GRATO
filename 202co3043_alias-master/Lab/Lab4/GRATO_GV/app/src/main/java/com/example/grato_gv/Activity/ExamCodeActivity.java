package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.grato_gv.Adapter.ExamCodeAdapter;
import com.example.grato_gv.Adapter.ListQuizScanAdapter;
import com.example.grato_gv.Model.ExamCode;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class ExamCodeActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView examCodeRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_code);

        addControls();
        addEvents();

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

    @Override
    protected void onStart() {
        super.onStart();
        getData();
    }

    private void getData() {
        ArrayList<ExamCode> lstExamCode = new ArrayList<>();
        lstExamCode.add(new ExamCode("001", null));
        lstExamCode.add(new ExamCode("002", null));
        lstExamCode.add(new ExamCode("003", null));
        lstExamCode.add(new ExamCode("004", null));

        // tạo adapter
        ExamCodeAdapter examCodeAdapter = new ExamCodeAdapter(lstExamCode);

        // performance
        examCodeRecyclerview.setHasFixedSize(true);

        // set adapter cho Recycler View
        examCodeRecyclerview.setAdapter(examCodeAdapter);
    }

    private void addControls() {
        examCodeRecyclerview = findViewById(R.id.examCodeItemRecyclerview);
        toolbar = findViewById(R.id.examCodeToolbar);
    }
}
