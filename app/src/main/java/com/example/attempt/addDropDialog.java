package com.example.attempt;

import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.List;

public class addDropDialog extends AppCompatDialogFragment {
    public static boolean act=true;


    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {


        final AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view= inflater.inflate(R.layout.adddrop,null);



        builder.setTitle("Detay")
                .setMessage("Ürün miktarı: ")

                .setPositiveButton("Onayla", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     act=true;

                    }
                })
                .setNegativeButton("Sepetten Çıkar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                act=false;

            }
        });



        return builder.create();
    }

    public static boolean callact(){
     return act;
    }

}
