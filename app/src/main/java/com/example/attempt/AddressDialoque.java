package com.example.attempt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentProvider;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.zip.Inflater;

public class AddressDialoque extends AppCompatDialogFragment {
    EditText adres,posta,aTip;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //adres.findViewById(R.id.Adress);
       // ilçe=getView().findViewById(R.id.ilçe);
       // posta.findViewById(R.id.pk);
       // aTip.findViewById(R.id.Adrestipi);

        final AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view= inflater.inflate(R.layout.diologadress,null);


        builder.setView(view)
                .setTitle("Adres")
                .setNegativeButton("İPTAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();
    }


}
