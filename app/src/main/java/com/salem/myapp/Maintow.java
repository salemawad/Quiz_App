package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.salem.myapp.DataB.Data;
import com.salem.myapp.adapter.Item_Adapter;
import com.salem.myapp.modle.Category_tow;
import com.salem.myapp.modle.Item2;

import java.util.ArrayList;


public class Maintow extends AppCompatActivity {
    TextView text_get;
    RecyclerView rvItem;
    Data data;

    Category_tow category_tow;
    ArrayList<Item2> item2s = new ArrayList<>();
    Item_Adapter item_adapter;
    int id;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rvItem = findViewById(R.id.rvItem);
        text_get = findViewById(R.id.text_get);

        preferences = getSharedPreferences(getPackageName(), MODE_PRIVATE);
        editor = preferences.edit();

        Intent intent = getIntent();
        category_tow = intent.getParcelableExtra("cate");

        text_get.setText(category_tow.getName());

        id = category_tow.getId();
        data = new Data(this);


        boolean isFirstTimeOpen = preferences.getBoolean("isFirstTimeOpen", true);

        if (isFirstTimeOpen) {
            editor.putBoolean("isFirstTimeOpen", false);
            editor.commit();

            data.insert_item("المناخ وعناصره", 1);
            data.insert_item("عناصر المناخ", 1);
            data.insert_item("الأقاليم الحارة في العالم", 1);
            data.insert_item("الأقاليم المعتدلة", 1);
            data.insert_item("الأقاليم الباردة", 1);

            data.insert_item("الموارد الطبيعية", 2);
            data.insert_item("الموارد المعدنية الطبيعية", 2);
            data.insert_item("موارد الطاقة", 2);
            data.insert_item("الموارد النباتية", 2);
            data.insert_item("الموارد البشرية", 2);

            data.insert_item("الكوارث", 3);
            data.insert_item("كوارث جيولوجية", 3);
            data.insert_item("كوارث مناخية", 3);
            data.insert_item("التصحر", 3);

            data.insert_item("السياحة مفهوما وتطورها وآثارها ", 4);
            data.insert_item("مقومات السياحة", 4);
            data.insert_item("أنواع السياحة", 4);
            data.insert_item("السياحة في الوطن العربي", 4);

            data.insert_item("الجغرافيا السياسية", 5);
            data.insert_item("الحدود السياسية", 5);
            data.insert_item("المشكلات السياسية", 5);
        }






        item2s.clear();
        item2s = data.get_item(id);
        item_adapter = new Item_Adapter(item2s);
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        rvItem.setAdapter(item_adapter);


    }


}