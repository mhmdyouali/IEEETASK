package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    CheckBox remember;
    TextView create_tv;
    EditText mail , pass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        remember = findViewById(R.id.remember_ct);
        create_tv = findViewById(R.id.create_acc_tv);
        mail = findViewById(R.id.mail_et);
        pass = findViewById(R.id.pass_et);


        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mail.setText("mmdouh1112@gmail.com");
                pass.setText("00001111");
            }
        });

        create_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create_page = new Intent(login.this , register.class);
                startActivity(create_page);
            }
        });

    }
}