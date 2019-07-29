package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Connect extends AppCompatActivity {
public int flag;
    private Handler myhandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);


        connection();

    }

   protected int Contact(){


        return 1 ;
        /////////important change this return cuz' its not boolean
       //
       //
       //
    }

    public void connection() {
        Toast.makeText(this, "Eşleştiriliyor", Toast.LENGTH_LONG).show();
      int x=  Contact();

        if (x==1) {  ;
            myhandler.postDelayed(setinvisible, 1000);
        }
        else{
            Toast.makeText(this,"Eşleşme Başarısız",Toast.LENGTH_LONG).show();
        ;
    }}

    private Runnable setinvisible = new Runnable() {
        @Override
        public void run() {
          Toast.makeText(Connect.this,"Cihaz eşleştirildi.",Toast.LENGTH_LONG).show();
        }
    };
    public void openMain(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
