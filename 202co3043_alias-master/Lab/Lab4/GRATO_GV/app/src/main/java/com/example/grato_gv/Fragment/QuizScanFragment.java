package com.example.grato_gv.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_gv.Adapter.ListQuizScanAdapter;
import com.example.grato_gv.Model.QuizScan;
import com.example.grato_gv.R;

import java.util.ArrayList;


public class QuizScanFragment extends Fragment {

    View view;
    RecyclerView quizScanRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quiz_scan, container, false);
        addControls();

        return view;
    }

    private void addControls() {
        quizScanRecyclerView = view.findViewById(R.id.quizScanItemRecyclerview);
    }

    @Override
    public void onStart() {
        super.onStart();
        getData();
    }

    private void getData() {
        ArrayList<QuizScan> lstQuizScan = new ArrayList<>();
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));
        lstQuizScan.add(new QuizScan("Midterm exam", 20, null));
        lstQuizScan.add(new QuizScan("Final exam", 40, null));

        // tạo adapter
        ListQuizScanAdapter listQuizScanAdapter = new ListQuizScanAdapter(lstQuizScan);

        // performance
        quizScanRecyclerView.setHasFixedSize(true);

        // set adapter cho Recycler View
        quizScanRecyclerView.setAdapter(listQuizScanAdapter);
    }
}
