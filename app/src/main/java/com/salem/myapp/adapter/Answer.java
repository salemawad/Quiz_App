package com.salem.myapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.salem.myapp.MainActivity;
import com.salem.myapp.R;
import com.salem.myapp.Tow;
import com.salem.myapp.modle.Qustion;

import java.util.ArrayList;


public class Answer extends RecyclerView.Adapter<Answer.myViewHolder> {

    ArrayList<String> data;
    String correct_ans;

    Context context;

    String answer = "";
    MediaPlayer player,player_false;
    public Answer(ArrayList<String> data, String correct_ans) {
        this.data = data;
        this.correct_ans = correct_ans;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ans_item, null, false);
        player=MediaPlayer.create(context.getApplicationContext(), R.raw.correct);
        player_false=MediaPlayer.create(context.getApplicationContext(), R.raw.fales);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tvAnswer.setText(data.get(position));
        holder.tvAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer.length() == 0) {
                    answer = data.get(position);
                    if (data.get(position).equals(correct_ans)) {
                         holder.tvAnswer.setBackgroundResource(R.color.green);
                        holder.tvAnswer.setTextColor(Color.WHITE);
                        player.start();
                    } else {
                        holder.tvAnswer.setTextColor(Color.RED);
                        player_false.start();

                        notifyDataSetChanged();
                    }
                }
            }
        });

        if (answer.length() != 0) {
            if (data.get(position).equals(correct_ans)) {
                holder.tvAnswer.setBackgroundResource(R.color.green);
                holder.tvAnswer.setTextColor(Color.WHITE);


                //  holder.tvAnswer.setTextColor(Color.GREEN);

            }
        }


    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView tvAnswer;
//        MediaPlayer player,player_false;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAnswer = itemView.findViewById(R.id.tvAnswer);
//            player=MediaPlayer.create(itemView.getContext(), R.raw.correct);
//            player_false=MediaPlayer.create(itemView.getContext(), R.raw.fals);


        }
    }

}
