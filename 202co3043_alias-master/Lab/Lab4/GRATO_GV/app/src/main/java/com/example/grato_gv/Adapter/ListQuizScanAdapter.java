package com.example.grato_gv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_gv.Activity.QuizScanOptionActivity;
import com.example.grato_gv.Model.Quiz;
import com.example.grato_gv.Model.QuizScan;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class ListQuizScanAdapter extends RecyclerView.Adapter<ListQuizScanAdapter.QuizScanViewHolder> {

    Context context;
    ArrayList<QuizScan> lstQuizScan;

    public ListQuizScanAdapter(ArrayList<QuizScan> lstQuizScan) {
        this.lstQuizScan = lstQuizScan;
    }

    @NonNull
    @Override
    public QuizScanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_quiz_scan_item, parent, false);
        return new QuizScanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizScanViewHolder holder, int position) {
        QuizScan quizScan = lstQuizScan.get(position);

        holder.tvQuizScanName.setText(quizScan.getName());
        holder.tvNumQuestion.setText(quizScan.getNumQuestions().toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, QuizScanOptionActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstQuizScan == null ? 0 : lstQuizScan.size();
    }

    class QuizScanViewHolder extends RecyclerView.ViewHolder{
        TextView tvQuizScanName, tvNumQuestion;

        public QuizScanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuizScanName = itemView.findViewById(R.id.tvQuizScanName);
            tvNumQuestion = itemView.findViewById(R.id.tvNumQuestion);
        }
    }
}
