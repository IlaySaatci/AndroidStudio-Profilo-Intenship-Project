package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Main2Activity extends AppCompatActivity {
    Button button;
    EditText user, password;
    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        slidr=Slidr.attach(this);
        setContentView(R.layout.activity_main2);
        user=findViewById(R.id.etuser);//.test
        password=findViewById(R.id.etpassword);//.test
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();

            }
        });
    }

    public void check(){
        if(user.getText().toString().equals("kasa")&& password.getText().toString().equals("1234")||user.getText().toString().equals("kasa")&& password.getText().toString().equals("0000")){
            Toast.makeText(Main2Activity.this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
            openActivityPanel();
        }
        else{
            Toast.makeText(Main2Activity.this, "Hatalı kullanıcı adı veya şifre girdiniz!", Toast.LENGTH_LONG).show();
        }

    }


    public void openActivityPanel() {//this is the method which communicates with another class
        Intent intent = new Intent(this, panel.class);//main2Act. class.
        startActivity(intent);
    }
}