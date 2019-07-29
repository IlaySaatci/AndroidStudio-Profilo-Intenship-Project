package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Listview extends AppCompatActivity {
   TextView textView;
   Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        textView.findViewById(R.id.miktar);
        b1=findViewById(R.id.add_btn);
    }
}
