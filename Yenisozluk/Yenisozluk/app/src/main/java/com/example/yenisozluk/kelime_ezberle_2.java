package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class kelime_ezberle_2 extends AppCompatActivity {
    DataBaseHelper dbHelper;
    kelime_ezberle kelim;
    int yeni;
    int i=0;
    kelime_array yenirenk=new kelime_array();
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_ceviri) {
            Intent gonder = new Intent(this, MainActivity.class);
            startActivity(gonder);
        }
        if (id == R.id.menu_kelime) {
            Intent gonder = new Intent(this, kelime_ezberle.class);
            startActivity(gonder);
        }
        if (id == R.id.menu_test) {
            Intent gonder = new Intent(this, test_menu.class);
            startActivity(gonder);
        }
        if (id == R.id.menu_istatistik) {
            Intent gonder = new Intent(this, statistics.class);
            startActivity(gonder);
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelime_ezberle_2);
        dbHelper = new DataBaseHelper(getApplicationContext());
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        Button button8 = (Button) findViewById(R.id.button8);

        switch (kelim.getSec()) {
           case 1:
              textView4.setText(String.valueOf(yenirenk.renken(i)));
              textView5.setText(String.valueOf(yenirenk.renktr(i)));
                i++;
               PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
               button8.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       if(yenirenk.renken(i)!=null){
                       textView4.setText(String.valueOf(yenirenk.renken(i)));
                       textView5.setText(String.valueOf(yenirenk.renktr(i)));
                           i++;
                           PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                       }
                   }
               });

               break;

            case 2:
                textView4.setText(String.valueOf(yenirenk.sayien(i)));
                textView5.setText(String.valueOf(yenirenk.sayitr(i)));
                i++;
                PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yenirenk.sayien(i)!=null){
                            textView4.setText(String.valueOf(yenirenk.sayien(i)));
                            textView5.setText(String.valueOf(yenirenk.sayitr(i)));
                            i++;
                            PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                        }
                    }
                });
                break;
            case 3:
                textView4.setText(String.valueOf(yenirenk.hayvanen(i)).toLowerCase());
                textView5.setText(String.valueOf(yenirenk.hayvantr(i)));
                i++;
                PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yenirenk.sayien(i)!=null){
                         textView4.setText(String.valueOf(yenirenk.hayvanen(i)).toLowerCase().substring(0,1).toUpperCase() + yenirenk.hayvanen(i).substring(1));
                            textView5.setText(String.valueOf(yenirenk.hayvantr(i)));
                            i++;
                            PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                        }
                    }
                });
                break;
            case 4:
                textView4.setText(String.valueOf(yenirenk.takvimen(i)));
                textView5.setText(String.valueOf(yenirenk.takvimtr(i)));
                i++;
                PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yenirenk.sayien(i)!=null){
                            textView4.setText(String.valueOf(yenirenk.takvimen(i)));
                            textView5.setText(String.valueOf(yenirenk.takvimtr(i)));
                            i++;
                            PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                        }

                    }
                });
                break;
            case 5:
                yeni=new Random().nextInt(1000);
                System.out.println(yeni);
                textView4.setText(String.valueOf(yenirenk.populeren(yeni)));
                textView5.setText(String.valueOf(yenirenk.populertr(yeni)));
                PreferenceManager.Instance(getApplicationContext()).Arttirezberle();

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            int yenim=new Random().nextInt(1000);
                            textView4.setText(String.valueOf(yenirenk.populeren(yenim)));
                            textView5.setText(String.valueOf(yenirenk.populertr(yenim)));
                        PreferenceManager.Instance(getApplicationContext()).Arttirezberle();
                    }
                });
                break;

        }
    }
}
