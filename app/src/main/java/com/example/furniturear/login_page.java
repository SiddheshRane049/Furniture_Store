package com.example.furniturear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_page extends AppCompatActivity {

    private EditText editTextText,editTextTextPassword2;
    private Button mainlogin, btncreateacc;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        editTextText = findViewById(R.id.editTextText);

        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);

        mainlogin = findViewById(R.id.mainlogin);

        btncreateacc = findViewById(R.id.btncreateacc);

        textView = findViewById(R.id.textView);

        mainlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page.this,home_page.class);
                startActivity(intent);

            }
        });

        btncreateacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}