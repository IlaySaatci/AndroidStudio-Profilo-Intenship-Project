package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Kartonay extends AppCompatActivity {
EditText kart,owner,ccv,date;
CheckBox checkBox;
Button button;
static public CartInformation cart=new CartInformation();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartonay);
        kart=findViewById(R.id.Kartnum);
        owner=findViewById(R.id.owner);
        ccv=findViewById(R.id.ccv);
        date=findViewById(R.id.date);
        checkBox=findViewById(R.id.checkBox);
        button=findViewById(R.id.buttonkaydet);

        cart.setCardNum(kart.getText().toString());
        cart.setOwner(owner.getText().toString());
        cart.setCcv(ccv.getText().toString());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOdeme();

            }
        });

        cart.setDate(date.getText().toString());

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                if (checkBox.isChecked()) {
                    button.setEnabled(true);
                }

                else{
                    button.setEnabled(false);
                    Toast.makeText(Kartonay.this,"Kart bilgilerimi kaydet butonuna tıklamadan devam edemezsiniz.",Toast.LENGTH_SHORT).show();

        }
            }

        });


    }
    public void openOdeme() {//this is the method which communicates with another class
        Intent intent = new Intent(this, odeme.class);//main2Act. class.
        startActivity(intent);
    }
}