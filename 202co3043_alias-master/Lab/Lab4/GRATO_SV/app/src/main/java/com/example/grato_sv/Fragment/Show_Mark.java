package com.example.grato_sv.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_sv.Adapter.MarkAdapter;
import com.example.grato_sv.Model.Mark;
import com.example.grato_sv.R;

import java.util.ArrayList;

public class Show_Mark extends Fragment {
    View view;
    RecyclerView rvList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tung_xem_diem, container, false);
        rvList = view.findViewById(R.id.recycle_3);
        getData();
        return view;
    }

    public void getData(){
        ArrayList<Mark> listMark = new ArrayList<>();
        listMark.add(new Mark("a","a","a","9.00"));
        listMark.add(new Mark("b","b","b","9.00"));
        MarkAdapter markAdapter = new MarkAdapter(listMark);
        rvList.setAdapter(markAdapter);
    }
}
