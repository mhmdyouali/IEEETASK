package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tochat , create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tochat = findViewById(R.id.tochat_btn);
        create = findViewById(R.id.create_btn);


        Toast.makeText(getApplicationContext() ,"Welcome" , Toast.LENGTH_LONG).show();


        tochat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatpage = new Intent(MainActivity.this , login.class);
                startActivity(chatpage);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create_page = new Intent(MainActivity.this , register.class);
                startActivity(create_page);
            }
        });

    }


}