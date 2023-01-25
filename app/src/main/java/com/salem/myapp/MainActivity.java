package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView but_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        but_log = findViewById(R.id.but_log);
        but_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String named=editText.getText()+"";
                if (editText.length()>=4){
                    Intent intent = new Intent(MainActivity.this, Tow.class);
                    startActivity(intent);
                 }else {
                    editText.setError("الرجاء ادخال اسمك");
                }
            }
        });

    }
}