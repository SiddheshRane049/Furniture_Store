package com.example.furniturear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class decorepage extends AppCompatActivity {
    private TextView textView6,item1_name,item2_name,item3_name,item1_price,item2_price,item3_price;
    private Button button,button3,button2;
    private ImageView imageView11, item1_image,item2_image,item3_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorepage);

        textView6 = findViewById(R.id.textView6);
        item1_name = findViewById(R.id.item1_name);
        item1_name = findViewById(R.id.item3_name);
        item3_name = findViewById(R.id.item3_name);
        item1_price = findViewById(R.id.item1_price);
        item2_price = findViewById(R.id.item2_price);
        item3_price = findViewById(R.id.item2_price);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        imageView11 = findViewById(R.id.imageView11);
        item1_image = findViewById(R.id.item1_image);
        item2_image = findViewById(R.id.item2_image);
        item3_image = findViewById(R.id.item2_image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(decorepage.this,Decoone_page.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(decorepage.this,Decotwo_page.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(decorepage.this,Decothree_page.class);
                startActivity(intent);
            }
        });
    }
}