package com.example.grato_gv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_gv.Activity.QuizScanAnswersActivity;
import com.example.grato_gv.Model.ExamCode;
import com.example.grato_gv.R;

import java.util.ArrayList;

public class ExamCodeAdapter extends RecyclerView.Adapter<ExamCodeAdapter.ExamCodeViewHolder> {

    Context context;
    ArrayList<ExamCode> lstExamCode;

    public ExamCodeAdapter(ArrayList<ExamCode> lstExamCode) {
        this.lstExamCode = lstExamCode;
    }

    @NonNull
    @Override
    public ExamCodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_exam_code_item, parent, false);
        return new ExamCodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExamCodeViewHolder holder, int position) {
        ExamCode examCode = lstExamCode.get(position);

        holder.tvExamCodeId.setText(examCode.getId());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, QuizScanAnswersActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstExamCode == null ? 0 : lstExamCode.size();
    }

    class ExamCodeViewHolder extends RecyclerView.ViewHolder {

        TextView tvExamCodeId;
        ImageView imgDelete;

        public ExamCodeViewHolder(@NonNull View itemView) {
            super(itemView);

            tvExamCodeId = itemView.findViewById(R.id.tvExamCodeId);
            imgDelete = itemView.findViewById(R.id.imgDelete);
        }
    }
}
