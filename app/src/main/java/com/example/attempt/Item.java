package com.example.attempt;

public class Item {
    private String name;
   private int id;
   private int basket;
   private int stok;
   private int kdv;
   private double fiyat;
   private String barkod;
   //long long yapısı bulamadım barkod için de integer veya long çok küçük kalıyordu ben de stringle alayım ihtiyaç duyarsam daha sonra çeviririm diye düşündüm.

    public Item() {
     Item item=new Item(name,id,barkod,kdv,stok,fiyat);
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getStok(){
        return stok;
    }

    public int getKdv(){
        return kdv;
    }
    public double getFiyat(){
        return fiyat;
    }
    public String getBarkod(){
        return barkod;
    }

    public void setStok(int stok){
        this.stok=stok;
    }
public void setId(int id){
        this.id=id;
}

public int increacetheBasket(){
        return basket++;
}
public int decreacetheBasket(){
        return basket--;
}

public Item(String name, int id,String barkod,int kdv,int stok,double fiyat){
        this.name=name;
        this.id=id;
        basket=0;
        this.stok=stok;
        this.kdv=kdv;
        this.barkod=barkod;
        this.fiyat=fiyat;
}

public String toString(){
        return ""+id+"-"+name;
}
}
