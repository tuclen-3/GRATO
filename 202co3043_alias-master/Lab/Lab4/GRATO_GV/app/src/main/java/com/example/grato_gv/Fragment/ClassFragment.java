package com.example.grato_gv.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_gv.Adapter.ListClassOfSubjectAdapter;
import com.example.grato_gv.Model.InfoClass;

import com.example.grato_gv.R;

import java.util.ArrayList;

public class ClassFragment extends Fragment {

    RecyclerView classRecyclerView;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_class, container, false);
        addControls();
        getData();
        return view;
    }

    private void getData(){
        ArrayList<InfoClass> lstInfoClasses = new ArrayList<>();
        lstInfoClasses.add(new InfoClass("L01",60,50));
        lstInfoClasses.add(new InfoClass("L02",50,40));
        lstInfoClasses.add(new InfoClass("L03",60,60));
        lstInfoClasses.add(new InfoClass("L04",30,10));

        ListClassOfSubjectAdapter listClassOfSubjectAdapter = new ListClassOfSubjectAdapter(lstInfoClasses);
        classRecyclerView.setHasFixedSize(true);
        classRecyclerView.setAdapter(listClassOfSubjectAdapter);

    }

    private void addControls(){
        classRecyclerView = view.findViewById(R.id.class_of_object_recycleview);
    }
}
