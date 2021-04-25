package com.example.grato_sv.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grato_sv.Model.Answer;
import com.example.grato_sv.R;

import java.util.ArrayList;

public class QuizItemAdapter extends RecyclerView.Adapter<QuizItemAdapter.AnswerHolder> {
    Context context;
    public ArrayList<Answer> listAnswer;
    public QuizItemAdapter( ArrayList<Answer> listAnswer){
        this.listAnswer = listAnswer;
    }
    @NonNull
    @Override
    public AnswerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.tung_quiz_item, parent, false); //đổi chỗ này lại khoan
        return new AnswerHolder(view);
    }
//ok, mà sao nhiều fule adapter vậy, quizitemadapter rồi còn quizadapter
    // do t làm nhiều mục khác nhau nhiều recycle.  à để tên sao cho dễ hiểu chớ nhiều file quiz quá đọc khó, tìm khó
    //ok thanks
    @Override
    public void onBindViewHolder(@NonNull AnswerHolder holder, int position) {
        Answer answer = listAnswer.get(position);
        holder.answer.setText(answer.getAnswer());
    }

    @Override
    public int getItemCount() {
        return listAnswer.size();
    }


    public class AnswerHolder extends RecyclerView.ViewHolder {

        public TextView answer;
        public AnswerHolder(@NonNull View itemView) {
            super(itemView);
            answer =(TextView) itemView.findViewById(R.id.answer);

        }
    }
}
