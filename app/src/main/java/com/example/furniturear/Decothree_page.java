package com.example.furniturear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Decothree_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decothree_page);
        ImageView imageView = findViewById(R.id.imageView3);
        TextView textView1 = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView8);
        TextView textView3 = findViewById(R.id.textView9);
        TextView textView4 = findViewById(R.id.textView10);
    }
}