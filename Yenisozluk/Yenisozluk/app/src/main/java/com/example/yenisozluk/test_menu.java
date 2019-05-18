package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class test_menu extends AppCompatActivity {
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
        setContentView(R.layout.activity_test_menu);
        Button btn_test = (Button) findViewById(R.id.btn_test);
         Button button10 = (Button) findViewById(R.id.button10);
         Button bosluk = (Button) findViewById(R.id.bosluk);
         final Button kendin_yaz = (Button) findViewById(R.id.kendin_yaz);
        final Intent coktan_secmeli = new Intent(this, coktan_secmeli.class);
        final Intent eslestirme = new Intent(this, kelime_eslestirme.class);
        final Intent boslukdoldur=new Intent(this,bosluk_doldurma.class);
        final Intent kendinyaz=new Intent(this,kendin_yaz.class);


        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(coktan_secmeli);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(eslestirme);
            }
        });
        bosluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(boslukdoldur);
            }
        });
        kendin_yaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(kendinyaz);
            }
        });
    }

}
