package com.salem.myapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.salem.myapp.Question;
import com.salem.myapp.R;
import com.salem.myapp.modle.Item2;

import java.util.ArrayList;

public class Item_Adapter extends RecyclerView.Adapter<Item_Adapter.myViewHolder> {
    ArrayList<Item2> data;
    Context context;

    public Item_Adapter(ArrayList<Item2> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tow_ad,null,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
     holder.tv_title.setText(data.get(position).getName());
     holder.tv_title.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(context, Question.class);
             intent.putExtra("qus",data.get(position));
             context.startActivity(intent);
         }
     });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class myViewHolder extends RecyclerView.ViewHolder {
    TextView  tv_title;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title=itemView.findViewById(R.id.tv_title_tow);
        }
    }
}
