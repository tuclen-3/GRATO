package com.example.grato_sv.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.grato_sv.Adapter.ShowListQuizAdapter;
import com.example.grato_sv.Model.Answer;
import com.example.grato_sv.Model.ListQuiz;
import com.example.grato_sv.R;

import java.util.ArrayList;

public class ShowListQuizActivity extends AppCompatActivity {
    RecyclerView rvList;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_quiz);

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
        rvList = findViewById(R.id.recycle_1);
        toolbar = findViewById(R.id.showlistquiztoolbar);
    }

    public void getData(){
        ArrayList<ListQuiz> listQuiz = new ArrayList<>();
        listQuiz.add(new ListQuiz("a","a","a","a"));
        listQuiz.add(new ListQuiz("b","b","b","b"));
        ShowListQuizAdapter quizAdapter = new ShowListQuizAdapter(listQuiz);
        rvList.setAdapter(quizAdapter);

    }
}