package com.salem.myapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.salem.myapp.Maintow;
import com.salem.myapp.R;
import com.salem.myapp.modle.Category_tow;

import java.util.ArrayList;

public class Tow_Adapter extends RecyclerView.Adapter<Tow_Adapter.myViewHolder> {
    ArrayList<Category_tow>data;
    Context context;
    public Tow_Adapter(ArrayList<Category_tow> data) {
        this.data=data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tow_ad, null, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    holder.tv_title_tow.setText(data.get(position).getName());
    holder.tv_title_tow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context, Maintow.class);
            intent.putExtra("cate",data.get(position));
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView  tv_title_tow;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title_tow=itemView.findViewById(R.id.tv_title_tow);
        }
    }
}
