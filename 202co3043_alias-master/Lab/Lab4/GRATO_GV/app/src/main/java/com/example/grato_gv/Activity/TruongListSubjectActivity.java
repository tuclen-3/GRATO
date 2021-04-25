package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.grato_gv.Adapter.truongListSubjectAdapter;
import com.example.grato_gv.Model.truongSubject;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class TruongListSubjectActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView listSubjectRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truong_list_subjects);
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
        ArrayList<truongSubject> lstSubject = new ArrayList<>();
        lstSubject.add(new truongSubject("Principle of Programing Language", "03"));
        lstSubject.add(new truongSubject("Data Structures and Algorithms", "01"));
        lstSubject.add(new truongSubject("Object Oriented Programing", "02"));
        lstSubject.add(new truongSubject("Network System", "04"));

        // tạo adapter
        truongListSubjectAdapter listSubjectAdapter = new truongListSubjectAdapter(lstSubject);

        // performance
        listSubjectRecyclerview.setHasFixedSize(true);

        // set adapter cho Recycler View
        listSubjectRecyclerview.setAdapter(listSubjectAdapter);
    }

    private void addControls() {
        listSubjectRecyclerview = findViewById(R.id.subjectItemRecyclerview);
        toolbar = findViewById(R.id.examCodeToolbar);
    }
}