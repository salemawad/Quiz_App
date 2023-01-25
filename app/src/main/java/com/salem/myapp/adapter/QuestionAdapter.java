package com.salem.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.salem.myapp.R;
import com.salem.myapp.modle.Qustion;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.myViewHolder> {
    
    Qustion data;

    Context context;
    public QuestionAdapter(Qustion data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.qu_item, null, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.tvTitle.setText(data.getName());

        Answer  answerAdapter = new Answer(data.getAnswer_list()  ,data.getCorrect_answer());
        holder.rvAnswer.setLayoutManager(new LinearLayoutManager(context));
        holder.rvAnswer.setAdapter(answerAdapter);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class myViewHolder extends ViewHolder {
        RecyclerView rvAnswer;
        TextView tvTitle;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            rvAnswer = itemView.findViewById(R.id.rvAnswer);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }
}
