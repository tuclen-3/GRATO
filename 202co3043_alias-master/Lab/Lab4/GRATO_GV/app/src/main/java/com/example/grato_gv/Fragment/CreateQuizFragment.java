package com.example.grato_gv.Fragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.SearchManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.example.grato_gv.Adapter.CreateQuizAdapter;
import com.example.grato_gv.Model.Quiz;
import com.example.grato_gv.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class CreateQuizFragment extends Fragment {

    View view;
    FloatingActionButton fabAdd;
    RecyclerView quizItemRecyclerview;
    CoordinatorLayout createQuizViewGroup;
    SearchView searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_create_quiz, container, false);
        addControls();
        getData();
        addEvents();

        return view;
    }

    private void addEvents() {
        // fabAdd quiz
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = getLayoutInflater().inflate(R.layout.layout_popup_add_new_quiz, null);

                AlertDialog alertDialog =
                        new AlertDialog.Builder(getContext())
                                .setView(popUpView)
                                .setCancelable(false)
                                .create();
                alertDialog.show();

                popUpView.findViewById(R.id.tvCancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

                // Spinner number quiz
                Spinner spinnerNumberQuiz = popUpView.findViewById(R.id.spinnerNumberQuiz);
                ArrayAdapter<String> adapterNumberQuiz = new ArrayAdapter<>(
                        getContext(),
                        android.R.layout.simple_spinner_item
                );
                adapterNumberQuiz.add("10 questions");
                adapterNumberQuiz.add("15 questions");
                adapterNumberQuiz.add("20 questions");
                adapterNumberQuiz.add("25 questions");

                adapterNumberQuiz.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
                spinnerNumberQuiz.setAdapter(adapterNumberQuiz);

                // Spinner max time
                Spinner spinnerMaxTime = popUpView.findViewById(R.id.spinnerMaxTime);
                ArrayAdapter<String> adapterMaxTime = new ArrayAdapter<>(
                        getContext(),
                        android.R.layout.simple_spinner_item
                );
                adapterMaxTime.add("5 minutes");
                adapterMaxTime.add("10 minutes");
                adapterMaxTime.add("15 minutes");
                adapterMaxTime.add("45 minutes");
                adapterMaxTime.add("60 minutes");
                adapterMaxTime.add("90 minutes");

                adapterMaxTime.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
                spinnerMaxTime.setAdapter(adapterMaxTime);


                // Deadline
                TextView tvDeadline = popUpView.findViewById(R.id.tvDeadline);
                ImageView imgDeadline = popUpView.findViewById(R.id.imgDeadline);
                Calendar calendar = Calendar.getInstance();
                imgDeadline.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
                                    @Override
                                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                        tvDeadline.setText(String.format("%d-%d-%d %d:%d %s",
                                                dayOfMonth,
                                                month+1,
                                                year,
                                                (hourOfDay < 12) ? hourOfDay : hourOfDay-12,
                                                minute,
                                                (hourOfDay < 12) ? "AM" : "PM"
                                                )
                                        );
                                    }
                                };

                                TimePickerDialog timePickerDialog = new TimePickerDialog(
                                        getContext(),
                                        timeSetListener,
                                        calendar.get(Calendar.HOUR),
                                        calendar.get(Calendar.MINUTE), // current hour, minute
                                        DateFormat.is24HourFormat(getContext())
                                );
                                timePickerDialog.show();
                            }
                        };
                        Calendar calendarDeadline = Calendar.getInstance();
                        DatePickerDialog datePickerDialog = new DatePickerDialog(
                                getContext(),
                                dateSetListener,
                                calendarDeadline.get(Calendar.YEAR),
                                calendarDeadline.get(Calendar.MONTH),
                                calendarDeadline.get(Calendar.DAY_OF_MONTH) // current year, month, day
                        );
                        datePickerDialog.show();
                    }
                });
            }
        });


        // Set text searchview color.White
        TextView textView = (TextView) searchView.findViewById(R.id.search_src_text);
        textView.setTextColor(Color.WHITE);
        textView.setHintTextColor(Color.WHITE);

    }


    private void getData() {
        // Khai báo data giả cho mảng
        ArrayList<Quiz> lstQuiz = new ArrayList<>();
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));
        lstQuiz.add(new Quiz("Quiz 6: Abstract syntax tree", "Deadline: 14 April 2021 12:10 PM", 10, 20));

        // tạo adapter
        CreateQuizAdapter createQuizAdapter = new CreateQuizAdapter(lstQuiz);
        // performance
        quizItemRecyclerview.setHasFixedSize(true);
        // set adapter cho Recycler View
        quizItemRecyclerview.setAdapter(createQuizAdapter);

    }



    private void addControls() {
        fabAdd = view.findViewById(R.id.fabAdd);
        quizItemRecyclerview = view.findViewById(R.id.quizItemRecyclerview);
        createQuizViewGroup = view.findViewById(R.id.createQuizViewGroup);
        searchView = view.findViewById(R.id.searchQuizName);
    }
}
