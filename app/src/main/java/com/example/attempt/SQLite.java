package com.example.attempt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite extends SQLiteOpenHelper {

    public SQLite(Context context) {
        super(context, "item", null, 1);
    }


    public void onCreate(SQLiteDatabase db) {
    String sql="create table item (id int primary key autoincrement , name text not null)";
    db.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase db, int eski, int yeni) {
   db.execSQL("drop table if exists item");
    }
}
