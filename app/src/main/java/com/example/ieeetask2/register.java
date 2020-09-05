package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    Button save_data ;
    EditText name ;
    EditText mail ;
    EditText phone ;
    EditText pass ;

    myDatabase db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        save_data = findViewById(R.id.create_btn);
        name = findViewById(R.id.cre_name);
        mail = findViewById(R.id.cre_mail_et);
        pass = findViewById(R.id.cre_pass_et);
        phone = findViewById(R.id.cre_phone_et);
       db = new myDatabase(this);

        save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user_name = name.getText().toString();
                String user_mail = mail.getText().toString();
                String user_phone = phone.getText().toString();
                String user_pass = pass.getText().toString();

                user1 user = new user1(user_name ,user_mail ,user_phone, user_pass);

              boolean res =  db.insert_user(user);

              if (res)
              {
                  Toast.makeText(getApplicationContext() ,"Data saved" , Toast.LENGTH_LONG).show();
              }
              else
              {
                  Toast.makeText(getApplicationContext() ,"Data not saved" , Toast.LENGTH_LONG).show();
              }

            }
        });

    }

}