package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Query;
import androidx.room.RoomDatabase;


import android.app.DownloadManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
ListView list;
public static FragmentManager fragmentManager;
   public String x = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list=findViewById(R.id.listview);



        ArrayList<String> items=new ArrayList<String>();

        items.add("");
        items.add("Adress");
        items.add("ödemeyi onayla");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);
        list.setAdapter(arrayAdapter);

    }


}
