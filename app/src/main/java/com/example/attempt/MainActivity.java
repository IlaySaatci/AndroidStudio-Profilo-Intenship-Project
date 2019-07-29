package com.example.attempt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.util.concurrent.CancellationException;


public class MainActivity extends AppCompatActivity{


    protected Connect obj=new Connect();
CardView c1,c2,c3,c4,c5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         c1=findViewById(R.id.sellicon);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if(obj.Contact()==0){
                c1.setEnabled(true);
                openDialog();

               Toast.makeText(MainActivity.this,"Eşleşme yapmadan satın alma panelini açamazsınız.",Toast.LENGTH_LONG).show();

                }
             else
                openActivity2();
            }
        });

       c2=findViewById(R.id.sellreport);

       c2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity3();

           }
       });

        c3=findViewById(R.id.sellicon2);

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(obj.Contact()==0){
                    c3.setEnabled(true);
                 openDialog();

                }

                else
               openzr();
            }
        } );
        c4=findViewById(R.id.help);

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpanel3();
            }
        });




    }



    public void openzr(){
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }


    public void openpanel3(){
        Intent intent=new Intent(this,panel3.class);
        startActivity(intent);
    }


    public  void openDialog(){
     Dialog dialog =new Dialog();
     dialog.show(getSupportFragmentManager(),"dialog");
    }


    public void openActivity2(){//this is the method which communicates with another class
        Intent intent= new Intent(this,Main2Activity.class);//main2Act. class.
        startActivity(intent);
    }
    public void openActivity3(){//this is the method which communicates with another class
        Intent intent= new Intent(this,Connect.class);//main2Act. class.
        startActivity(intent);


    }
    public void openActivity4(){//this is the method which communicates with another class
        Intent intent= new Intent(this,panel3.class);//main2Act. class.
        startActivity(intent);
    }

    public void openActivity5(){//this is the method which communicates with another class
        Intent intent= new Intent(this,odeme.class);//main2Act. class.
        startActivity(intent);
    }


    public void opensepet(){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch(item.getItemId()) {
            case R.id. subitem1:
                Toast.makeText(this, "ürünlerimiz", Toast.LENGTH_SHORT).show();
                openActivity2(); //its open the other pages its my own method
                return true;
        }
        switch(item.getItemId()) {
            case R.id. subitem2:
                Toast.makeText(this, "subitem was selected", Toast.LENGTH_SHORT).show();
               opensepet();
                return true;
        }

        switch(item.getItemId()) {
            case R.id. subitem3:
                Toast.makeText(this, "subitem was selected", Toast.LENGTH_SHORT).show();
               //
                //
                //
                //
                // opentest();
                openActivity4();

            return true;
        }
        switch(item.getItemId()) {
            case R.id. subitem4: openActivity5();
                Toast.makeText(this, "subitem was selected", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch(item.getItemId()) {
            case R.id. subitem5:

                Toast.makeText(this, "subitem was selected", Toast.LENGTH_SHORT).show();
                return true;
        }


        return super.onOptionsItemSelected(item);

    }


}
