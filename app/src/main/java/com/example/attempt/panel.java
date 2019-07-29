package com.example.attempt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class panel extends AppCompatActivity {
    ImageView p1, p2, p3, p4,p5,p6,p7,p8,p9,p10,p11,p12;
    static TextView textCartItemCount;
    static int mCartItemCount;
   static Item k=new Item("name",mCartItemCount,null,8,0,0);
   static String lists[];
    public int counter=0;
    Item a=new Item("name",0,"null",8,counter,0);

    static Item item1=new Item("limonata",1,"null",8,50,7.50);
    static Item item2=new Item("pasta",2,"null",8,15,10.00);
    static Item item3=new Item("dondurma",3,"null",8,30,12.00);
    static Item item4=new Item("makarna",4,"null",8,40,12.50);
    static Item item5=new Item("kola",5,"null",8,45,6.00);
    static Item item6=new Item("portakal suyu",6,"null",8,50,8.00);
    static Item item7=new Item("waffle",7,"null",8,20,15.50);
    static Item item8=new Item("kahve",8,"null",8,50,10.00);
    static Item item9=new Item("Cheeseburger",7,"null",6,20,14.50);
    static Item item10=new Item("Hamburger",7,"null",6,20,15.75);
    static Item item11=new Item("8'li Nugget",7,"null",8,20,9.00);
    static Item item12=new Item("su",8,"null",8,50,1.50);



    //ID'leri static tanımlamayınca kullanamıyorum çözüm de bulamadım. karmaşa için üzgünüm.

    static int dp1=0,dp2=0,dp3=0,dp4=0,dp5=0,dp6=0 ,dp7=0, dp8=0, dp9=0,dp10=0,dp11=0,dp12=0;
    static Double x=odeme.Cost();
    //çok saçma biliyorum ama butonların daha önceden tıklanmış olup olmadığını anlamak için böyle saçma bi yöntem buldum kendimce.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        p1 = findViewById(R.id.product1_1);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp1++;

           increaseBasket();
           setupBadge();

                Toast.makeText(getBaseContext(), "ürün sepete eklendi", Toast.LENGTH_SHORT).show();
                //look at here later

            }
        });


        p2=findViewById(R.id.product1_2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp2++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });

        p3=findViewById(R.id.product1_3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp3++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });


        p4=findViewById(R.id.product2_1);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp4++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });

        p5=findViewById(R.id.product2_2);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp5++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });


        p6=findViewById(R.id.product2_3);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp6++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });

        p7=findViewById(R.id.product3_1);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp7++;
                increaseBasket();
                setupBadge();;
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });

        p8=findViewById(R.id.product3_2);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp8++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });
     p9=findViewById(R.id.product3_3);
     p9.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             dp9++;
             increaseBasket();
             setupBadge();
             Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
         }
     });

        p10=findViewById(R.id.product4_1);
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp10++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });


        p11=findViewById(R.id.product4_2);
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp11++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });

        p12=findViewById(R.id.product4_3);
        p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp12++;
                increaseBasket();
                setupBadge();
                Toast.makeText(getBaseContext(),"ürün sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_basket, menu);

        final MenuItem menuItem = menu.findItem(R.id.action_cart);

        View actionView = MenuItemCompat.getActionView(menuItem);
        textCartItemCount = (TextView) actionView.findViewById(R.id.cart_badge);

        setupBadge();

        actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOptionsItemSelected(menuItem);


            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_cart: {
               /* for(int i=0;i<increaseBasket();i++) {
                    Intent intent = new Intent(panel.this, Cart.class);
                    intent.putExtra("name", lists[i]);
                    startActivity(intent);
                }*/
               openOdeme();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupBadge() {

        if (textCartItemCount != null) {
            if (mCartItemCount == 0) {
                if (textCartItemCount.getVisibility() != View.GONE) {
                    textCartItemCount.setVisibility(View.GONE);
                }
            } else {
                textCartItemCount.setText(String.valueOf(Math.min(mCartItemCount, 99)));
                if (textCartItemCount.getVisibility() != View.VISIBLE) {
                    textCartItemCount.setVisibility(View.VISIBLE);
                }
            }
        }
    }
    public boolean makeFalse(){ return false; }

    public void openOdeme() {//this is the method which communicates with another class
        Intent intent = new Intent(this, odeme.class);//main2Act. class.
        startActivity(intent);
    }


    public static int increaseBasket() {
       int x= k.increacetheBasket()+1;
        mCartItemCount=x ;
     return mCartItemCount;
    }


    public static int decreaseBasket() {
        int x=k.decreacetheBasket()-1;
     mCartItemCount=x;
        return mCartItemCount;
    }





}








