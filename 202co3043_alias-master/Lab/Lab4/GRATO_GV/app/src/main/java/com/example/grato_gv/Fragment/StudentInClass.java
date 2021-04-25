package com.example.grato_gv.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grato_gv.Activity.ViewStudentInClass;
import com.example.grato_gv.Adapter.ListClassOfSubjectAdapter;
import com.example.grato_gv.Adapter.ViewStudentInClassAdapter;
import com.example.grato_gv.Model.InfoClass;
import com.example.grato_gv.Model.Student;
import com.example.grato_gv.R;

import java.util.ArrayList;


public class StudentInClass extends Fragment {

    RecyclerView classRecyclerView;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_in_class, container, false);
        addControls();
        getData();
        return view;
    }

    private void getData(){
        ArrayList<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student("Cao Xuan Tai","1811222"));
        lstStudent.add(new Student("H'Hen Nie","1812353"));
        lstStudent.add(new Student("Do My Linh","1812332"));
        lstStudent.add(new Student("Nguyen Xuan Tien","1812340"));

        ViewStudentInClassAdapter viewStudentInClass = new ViewStudentInClassAdapter(lstStudent);
        classRecyclerView.setHasFixedSize(true);
        classRecyclerView.setAdapter(viewStudentInClass);

    }

    private void addControls(){
        classRecyclerView = view.findViewById(R.id.list_student_in_class);
    }
}