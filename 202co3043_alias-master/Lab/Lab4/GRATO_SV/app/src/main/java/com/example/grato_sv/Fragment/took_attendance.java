package com.example.grato_sv.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.grato_sv.Activity.ShowListQuizActivity;
import com.example.grato_sv.Activity.tungtookattendance;
import com.example.grato_sv.R;

public class took_attendance extends Fragment {
    View view;
    Context context;
    androidx.appcompat.widget.AppCompatButton button1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tung_activity_main, container, false);
        button1 = view.findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), tungtookattendance.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
