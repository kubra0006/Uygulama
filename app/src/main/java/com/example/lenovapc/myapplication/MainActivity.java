package com.example.lenovapc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView a = (ListView) findViewById(R.id.gazatelistesi);
        ArrayList<gazetemodel> gazetelistesi = new ArrayList<gazetemodel>();
        gazetelistesi.add(new gazetemodel("Milliyet" , "resim", "https://milliyet.com.tr"));
        gazetelistesi.add(new gazetemodel("Akşam" , "resim", "https://aksam.com.tr"));
        gazeteadaptor gadaptor = new gazeteadaptor(this,gazetelistesi);
        a.setAdapter(gadaptor);

        a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gazetemodel gazete = (gazetemodel) adapterView.getItemAtPosition(i);
                Intent intent =new Intent (getApplicationContext(),habersayfasi.class);
                intent.putExtra("url",gazete.url);
                startActivity(intent);
            }
        });


    }
}
