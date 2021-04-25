package com.example.grato_gv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.grato_gv.Activity.AddQuestionActivity;
import com.example.grato_gv.Model.Quiz;
import com.example.grato_gv.R;

import java.util.ArrayList;


///////

public class CreateQuizAdapter extends RecyclerView.Adapter<CreateQuizAdapter.QuizViewHolder> {

    Context context;
    ArrayList<Quiz> lstQuiz;

    public CreateQuizAdapter(ArrayList<Quiz> lstQuiz) {
        this.lstQuiz = lstQuiz;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_quiz_item, parent, false);
        return new QuizViewHolder(view);
    }

    // gán dữ liệu
    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        Quiz quiz = lstQuiz.get(position);

        holder.tvQuizName.setText(quiz.getQuizName());
        holder.tvNumQuestion.setText(quiz.getNumQuestion() + " questions");
        holder.tvTime.setText(quiz.getTime() + " minutes");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddQuestionActivity.class);
                context.startActivity(intent);
            }
        });

        holder.tvAddClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUpClass popUpClass = new PopUpClass();
                popUpClass.showPopupWindow(v);

            }

        });
    }

    @Override
    public int getItemCount() {
        return lstQuiz == null ? 0 : lstQuiz.size();
    }

    // lưu lại view để khi gọi lại chỉ cần lấy ra => tăng hiệu suất
    class QuizViewHolder extends RecyclerView.ViewHolder{

        TextView tvQuizName, tvNumQuestion, tvTime, tvDeadline;
        TextView tvAddClass, tvEdit, tvDelete;

        // ánh xạ
        public QuizViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuizName = (TextView) itemView.findViewById(R.id.tvQuizName);
            tvNumQuestion = (TextView) itemView.findViewById(R.id.tvNumQuestion);
            tvTime = (TextView) itemView.findViewById(R.id.tvTime);
            tvDeadline = (TextView) itemView.findViewById(R.id.tvDeadline);
            tvAddClass = (TextView) itemView.findViewById(R.id.tvAddClass);
            tvEdit = (TextView) itemView.findViewById(R.id.tvEdit);
            tvDelete = (TextView) itemView.findViewById(R.id.tvDelete);

            //////

        }
    }
}



