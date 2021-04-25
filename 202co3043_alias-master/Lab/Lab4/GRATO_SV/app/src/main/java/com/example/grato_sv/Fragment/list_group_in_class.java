package com.example.grato_sv.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grato_sv.Adapter.listGroupInClassAdapter;
import com.example.grato_sv.Model.Group;
import com.example.grato_sv.R;

import java.util.ArrayList;


public class list_group_in_class extends Fragment {

    RecyclerView listGroupRecycleView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list_group_in_class, container, false);
        addControls();
        // Inflate the layout for this fragment
        getData();
        return view;
    }

    private void getData() {
        ArrayList<Group> lstGroup = new ArrayList<>();
        lstGroup.add(new Group("Alias",3,3));
        lstGroup.add(new Group("Pepsi",4,1));
        lstGroup.add(new Group("CoCa",3,2));
        lstGroup.add(new Group("Sting",3,2));

        listGroupInClassAdapter listGroupClassAdapter = new listGroupInClassAdapter(lstGroup);
        listGroupRecycleView.setHasFixedSize(true);
        listGroupRecycleView.setAdapter(listGroupClassAdapter);
    }

    private void addControls() {
        listGroupRecycleView = view.findViewById(R.id.list_group);
    }
}