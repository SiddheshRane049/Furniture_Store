package com.example.furniturear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView backone;
    private EditText entername, editTextTextEmailAddress2,editTextTextPassword;
    private Button login,createacc;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backone = findViewById(R.id.backone);

        entername = findViewById(R.id.entername);

        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2);

        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        login = findViewById(R.id.login);

        createacc = findViewById(R.id.createacc);

        textView3 = findViewById(R.id.textView3);

        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,home_page.class);
                startActivity(intent);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,login_page.class);
                startActivity(intent);
            }
        });

    }
}