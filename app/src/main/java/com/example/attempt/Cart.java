package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Cart extends AppCompatActivity {
TextView textView;


    // Array of strings...
    ListView simpleList;
    String lists[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
      textView=findViewById(R.id.texting);

        ListView liste=(ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> Adaptor=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_activated_1, android.R.id.text1, lists);

        liste.setAdapter(Adaptor);


          /*  Intent intent = getIntent();

            String name = intent.getStringExtra("Name");
           textView.setText("product"+ name);*/


        }
    }

