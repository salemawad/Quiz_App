package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.salem.myapp.DataB.Data;
import com.salem.myapp.adapter.Tow_Adapter;
import com.salem.myapp.modle.Category_tow;

import java.util.ArrayList;

public class Tow extends AppCompatActivity {
    private TextView summary;
    //    textView1, textView2, textView3, textView4, textView5;
    RecyclerView rvItem;
    Tow_Adapter tow_adapter;
    Data data;
    ArrayList<Category_tow> category_tows = new ArrayList<>();
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow);

        summary = findViewById(R.id.summary);
        summary.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                summary.setBackgroundColor(R.color.Nobel);
                summary.setTextColor(Color.WHITE);


                Intent intent = new Intent(Tow.this, PDF.class);

                startActivity(intent);

            }
        });
        sharedPreferences = getSharedPreferences(getPackageName(), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        rvItem = findViewById(R.id.rvItem);
        data = new Data(this);

        boolean isFirst = sharedPreferences.getBoolean("isFirst", true);
        if (isFirst) {

            editor.putBoolean("isFirst", false);
            editor.commit();

            data.insert_Ca("الجغرافيا المناخية");
            data.insert_Ca("الموارد الطبيعية والبشرية");
            data.insert_Ca("مخاطر تهدد الارض");
            data.insert_Ca("السياحة");
            data.insert_Ca("الجغرافيا السياسية");

        }


        category_tows.clear();
        category_tows = data.get_Ca();
        tow_adapter = new Tow_Adapter(category_tows);
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        rvItem.setAdapter(tow_adapter);


//        textView1 = findViewById(R.id.textView1);
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                textView1.setBackgroundColor(R.color.Nobel);
//                textView1.setTextColor(Color.WHITE);
//                Intent intent = new Intent(Tow.this, maintow.class);
//                intent.putExtra("text", textView1.getText().toString());
//                startActivity(intent);
//            }
//        });
//        textView2 = findViewById(R.id.textView2);
//        textView2.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                textView2.setBackgroundColor(R.color.Nobel);
//                textView2.setTextColor(Color.WHITE);
//                Intent intent = new Intent(Tow.this, maintow.class);
//                intent.putExtra("text", textView2.getText().toString());
//                startActivity(intent);
//
//            }
//        });
//        textView3 = findViewById(R.id.textView3);
//        textView3.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                textView3.setBackgroundColor(R.color.Nobel);
//                textView3.setTextColor(Color.WHITE);
//                Intent intent = new Intent(Tow.this, maintow.class);
//                intent.putExtra("text", textView3.getText().toString());
//                startActivity(intent);
//
//            }
//        });
//        textView4 = findViewById(R.id.textView4);
//        textView4.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                textView4.setBackgroundColor(R.color.Nobel);
//                textView4.setTextColor(Color.WHITE);
//                Intent intent = new Intent(Tow.this, maintow.class);
//                intent.putExtra("text", textView4.getText().toString());
//                startActivity(intent);
//
//            }
//        });
//        textView5 = findViewById(R.id.textView5);
//        textView5.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                textView5.setBackgroundColor(R.color.Nobel);
//                textView5.setTextColor(Color.WHITE);
//
//                Intent intent = new Intent(Tow.this, maintow.class);
//                intent.putExtra("text", textView5.getText().toString());
//                startActivity(intent);
//
//            }
//        });


    }

}