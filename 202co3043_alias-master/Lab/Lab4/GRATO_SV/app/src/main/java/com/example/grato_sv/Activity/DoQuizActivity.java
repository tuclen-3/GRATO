package com.example.grato_sv.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.grato_sv.Adapter.QuizItemAdapter;
import com.example.grato_sv.Model.Answer;
import com.example.grato_sv.R;

import java.util.ArrayList;

public class DoQuizActivity extends AppCompatActivity {

    RecyclerView rvList;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_quiz);
        addControls();
        getData();
        addEvents();
    }
    private void addEvents() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void addControls() {
        rvList = findViewById(R.id.recycle_2);
        toolbar = findViewById(R.id.dolistquiztoolbar);
    }
    public void getData(){
        ArrayList<Answer> listAnswer = new ArrayList<>();
        listAnswer.add(new Answer("2"));
        listAnswer.add(new Answer("4"));
        QuizItemAdapter listAdapter = new QuizItemAdapter(listAnswer);
        rvList.setAdapter(listAdapter);
    }
}