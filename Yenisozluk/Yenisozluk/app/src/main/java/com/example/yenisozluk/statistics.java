package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class statistics extends AppCompatActivity {
        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.menu_ceviri) {
            Intent gonder =new Intent(this,MainActivity.class);
            startActivity(gonder);
        }
        if(id==R.id.menu_kelime) {
            Intent gonder =new Intent(this,kelime_ezberle.class);
            startActivity(gonder);
        }
        if(id==R.id.menu_test) {
            Intent gonder =new Intent(this,test_menu.class);
            startActivity(gonder);
        }
        if(id==R.id.menu_istatistik) {
            Intent gonder =new Intent(this,statistics.class);
            startActivity(gonder);
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        TextView karsilasilan_kelime=(TextView) findViewById(R.id.karsilasilan_kelime);
        TextView cozulen_test=(TextView) findViewById(R.id.cozulen_test);
        TextView cozulen_bosluk=(TextView) findViewById(R.id.cozulen_bosluk);
        TextView cozulen_kelime=(TextView) findViewById(R.id.cozulen_kelime);
        TextView cozulen_kendinyaz=(TextView) findViewById(R.id.cozulen_kendinyaz);

        cozulen_test.setText(String.valueOf(PreferenceManager.Instance(this).CekCoktanSecmeli()));
        karsilasilan_kelime.setText(String.valueOf(PreferenceManager.Instance(this).Cekezberle()));
        cozulen_kelime.setText(String.valueOf(PreferenceManager.Instance(this).Cekeslestirme()));
        cozulen_kendinyaz.setText(String.valueOf(PreferenceManager.Instance(this).CekKendinyaz()));
        cozulen_bosluk.setText(String.valueOf(PreferenceManager.Instance(this).CekBoslukDoldurma()));



    }
}
