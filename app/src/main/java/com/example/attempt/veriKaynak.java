package com.example.attempt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class veriKaynak {
    private SQLiteDatabase db;
    private SQLite mydb;

    public veriKaynak(Context c) {
        mydb = new SQLite(c);
    }

    public void open() {
        db = mydb.getWritableDatabase();
    }

    public void closedb() {
        mydb.close();
    }

    void additem(Item k) {
        //String name = "su";
       // Item item1 = new Item();
       // item1.setName(name);
        ContentValues val = new ContentValues();
        val.put("name", k.getName());
        db.insert("item", null, val);

    }
    public void DeleteItem(Item k){
      int id= k.getId();
      db.delete("item","id"+id,null);
    }



   /* public List<Item> listele(){
        String kolonlar[]={"id","name"};
        List<Item> liste = new ArrayList<Item>();
        Cursor cursor=db.query("item",kolonlar,null,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()) {
            int id=cursor.getInt(0);
            String name =cursor.getString(1);
           String eleman=""+id+"-"+name;
            Item item1=new Item(name,id,);
           liste.add(item1);
           cursor.moveToNext();
        }

    cursor.close();
        return liste;
    }
*/
}