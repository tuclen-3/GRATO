package com.example.grato_sv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.INotificationSideChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_sv.Activity.DoQuizActivity;
import com.example.grato_sv.Activity.ShowListQuizActivity;
import com.example.grato_sv.Model.ListQuiz;
import com.example.grato_sv.R;

import java.util.ArrayList;

public class ShowListQuizAdapter extends RecyclerView.Adapter<ShowListQuizAdapter.QuizHolder> {
    Context context;
    public ArrayList<ListQuiz> listQuiz;
    public ShowListQuizAdapter(ArrayList<ListQuiz> listQuiz){
        this.listQuiz = listQuiz;
    }
    @NonNull
    @Override
    public QuizHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_listquiz, parent, false);
        return new QuizHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull QuizHolder holder, int position) {

        ListQuiz quiz = listQuiz.get(position);
        holder.name.setText(quiz.getName());
        holder.deadline.setText(quiz.getDeadline());
        holder.complete.setText(quiz.getComplete());
        holder.button.setText(quiz.getButtonQuiz());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DoQuizActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listQuiz.size();
    }

    public class QuizHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView deadline;
        public TextView complete;
        public TextView button;
        public QuizHolder(@NonNull View itemView) {
            super(itemView);
            name =(TextView) itemView.findViewById(R.id.name);
            deadline =(TextView) itemView.findViewById(R.id.deadline);
            complete = (TextView) itemView.findViewById(R.id.complete);
            button = (TextView) itemView.findViewById(R.id.buttonquiz);
        }
    }
}
