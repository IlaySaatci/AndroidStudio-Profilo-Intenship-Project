
package com.example.attempt;

import android.app.ListActivity;
import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class panel3 extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel3);
        textView=findViewById(R.id.mail);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Browser(view);
            }
        });
    }

    public void Browser(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/"));
        startActivity(browserIntent);
    }
}

