package com.example.attempt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class odeme extends AppCompatActivity {
    SeekBar simpleSeekBar;
    int seekvalue;
    CardView sepetPopup, adress, cartbilgisi;
    ListView listView;
  static ArrayList<String> dizi = new ArrayList<String>();
  static ArrayList<Double>total= new ArrayList<Double>();
    Double x=Cost();
    TextView textView,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme);
        listView = findViewById(R.id.sepetview);
        textView = findViewById(R.id.texting);
        sepetPopup=findViewById(R.id.sepetPopUp);
        price=findViewById(R.id.cost);

        diziCond();




        sepetPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double y=x+Cost() ;
                String i=y.toString();


                new AlertDialog.Builder(odeme.this)
                        .setTitle("Fiyat")
                        .setMessage("Toplam fiyat:  "+i)

                        .setPositiveButton("onayla", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })

                        .show();


            }
        });

        final ArrayAdapter<String> Adaptor = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_activated_1, android.R.id.text1, dizi);

        listView.setAdapter(Adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,final int position, long id) {

                new AlertDialog.Builder(odeme.this)
                         .setTitle("Sepet Detayı")
                        .setMessage("Ürün miktarı ")

                        .setPositiveButton("kapat", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                         .setNegativeButton("sepetten çıkar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dizi.remove(position);
                        panel.decreaseBasket();  //look at that later
                        decSeekval();
                        total.remove(position);
                        price.setText(Cost().toString());
                        Adaptor.notifyDataSetChanged();

                    }

                })
                        .show();

            }
        });





        cartbilgisi = findViewById(R.id.cartPopUp);
        cartbilgisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkart();
                incSeekval();
            }
        });


        adress = findViewById(R.id.Adress);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
                incSeekval();
            }
        });


        simpleSeekBar = (SeekBar) findViewById(R.id.simpleSeekBar);
        seekvalue = simpleSeekBar.getProgress();
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                seekvalue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(odeme.this, "Seek bar progress is :" + seekvalue, Toast.LENGTH_SHORT).show();
            }
        });



        price.setText(Cost().toString());



    }

    public void openDialog() {
        AddressDialoque addressDialoque = new AddressDialoque();
        addressDialoque.show(getSupportFragmentManager(), "address dialog");
    }

    public void openkart(){
        Intent intent=new Intent(this,Kartonay.class);
        startActivity(intent);
    }

    public int incSeekval() {
        seekvalue++;
        return seekvalue;
    }
    public int decSeekval() {
        seekvalue=seekvalue-1;
        return seekvalue--;
    }

    public void diziCond() {

        if (panel.dp1 >0) {for( int i=0;i<panel.dp1;i++ ){dizi.add(panel.item1.getName()); total.add(panel.item1.getFiyat());} }
        if (panel.dp2 >0) { for( int i=0;i<panel.dp2;i++ ) {dizi.add(panel.item2.getName());total.add(panel.item2.getFiyat()); } }
        if (panel.dp3 >0) { for( int i=0;i<panel.dp3;i++ ){dizi.add(panel.item3.getName()); total.add(panel.item3.getFiyat());}}
        if (panel.dp4 >0) { for( int i=0;i<panel.dp4;i++ ) {dizi.add(panel.item4.getName());total.add(panel.item4.getFiyat());} }
        if (panel.dp5 >0) { for( int i=0;i<panel.dp5;i++ ) {dizi.add(panel.item5.getName());total.add(panel.item5.getFiyat()); }}
        if (panel.dp6 >0) { for( int i=0;i<panel.dp6;i++ ) {dizi.add(panel.item6.getName());total.add(panel.item6.getFiyat()); }}
        if (panel.dp7 >0) { for( int i=0;i<panel.dp7;i++ ){dizi.add(panel.item7.getName()); total.add(panel.item7.getFiyat());}}
        if (panel.dp8 >0) { for( int i=0;i<panel.dp8;i++ ){dizi.add(panel.item8.getName());total.add(panel.item8.getFiyat()); }}
        if (panel.dp9 >0) { for( int i=0;i<panel.dp9;i++ ){dizi.add(panel.item9.getName()); total.add(panel.item9.getFiyat());}}
        if (panel.dp10 >0) { for( int i=0;i<panel.dp10;i++){dizi.add(panel.item10.getName()); total.add(panel.item10.getFiyat());}}
        if (panel.dp11 >0) { for( int i=0;i<panel.dp11;i++){dizi.add(panel.item11.getName());total.add(panel.item11.getFiyat()); }}
        if (panel.dp12 >0) { for( int i=0;i<panel.dp12;i++){dizi.add(panel.item12.getName()); total.add(panel.item12.getFiyat());}}

        panel.dp1=0;panel.dp2=0;panel.dp3=0;panel.dp4=0;panel.dp5=0;panel.dp6=0;panel.dp7=0;panel.dp8=0;panel.dp9=0;panel.dp10=0;panel.dp11=0; panel.dp12=0;
    }

    public  void openadddrop(){
        addDropDialog dialog = new addDropDialog();
        dialog.show(getSupportFragmentManager(),"dialog");


    }

   static public Double Cost(){
        int a= total.size();
        Double x=0.00;
        for(int i =0; i<a;i++){
           x= x+total.get(i);
        }
      return x;

    }


}
