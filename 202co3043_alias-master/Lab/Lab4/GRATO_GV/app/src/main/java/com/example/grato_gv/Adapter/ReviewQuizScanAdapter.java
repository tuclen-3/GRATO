package com.example.grato_gv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_gv.Activity.ViewScanActivity;
import com.example.grato_gv.Model.QuizScanReview;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class ReviewQuizScanAdapter extends RecyclerView.Adapter<ReviewQuizScanAdapter.ReviewQuizScanViewHolder> {

    Context context;
    ArrayList<QuizScanReview> lstQuizScanReview;

    public ReviewQuizScanAdapter(ArrayList<QuizScanReview> lstQuizScanReview) {
        this.lstQuizScanReview = lstQuizScanReview;
    }

    @NonNull
    @Override
    public ReviewQuizScanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_review_quiz_scan_item, parent, false);
        return new ReviewQuizScanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewQuizScanViewHolder holder, int position) {
        QuizScanReview quizScanReview = lstQuizScanReview.get(position);

        holder.tvStudentId.setText(quizScanReview.getStudent().getId());
        holder.tvStudentName.setText(quizScanReview.getStudent().getName());
        holder.tvExamCodeId.setText("Exam code: " + quizScanReview.getExamCode().getId());
        holder.tvScore.setText(quizScanReview.getScore() + "");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewScanActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstQuizScanReview == null ? 0 : lstQuizScanReview.size();
    }

    class ReviewQuizScanViewHolder extends RecyclerView.ViewHolder {
        TextView tvStudentId, tvStudentName, tvExamCodeId, tvScore;

        public ReviewQuizScanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStudentId = (TextView) itemView.findViewById(R.id.tvStudentId);
            tvStudentName = (TextView) itemView.findViewById(R.id.tvStudentName);
            tvExamCodeId = (TextView) itemView.findViewById(R.id.tvExamCodeId);
            tvScore = (TextView) itemView.findViewById(R.id.tvScore);
        }
    }
}
