package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class PDF extends AppCompatActivity {

    PDFView pdf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);
        pdf=findViewById(R.id.pdf);
         pdf.fromAsset("pdfK.pdf").load();
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }
}