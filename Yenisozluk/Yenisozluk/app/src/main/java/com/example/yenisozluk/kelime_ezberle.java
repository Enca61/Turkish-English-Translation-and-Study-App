package com.example.yenisozluk;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class kelime_ezberle extends AppCompatActivity {
    public static int getSec() {
        return sec;
    }

    public static void setSec(int sec) {
        kelime_ezberle.sec = sec;
    }

    static int sec=0; //hangisi seçildi diye kullancan ilerdev
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
        setContentView(R.layout.activity_kelime_ezberle);

        Button hayvanlar_btn = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        final Intent intent = new Intent(this, kelime_ezberle_2.class);
        hayvanlar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec=1;
                startActivity(intent);
            }
        });
                button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec=2;
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec=3;
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec=4;
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec=5;
                startActivity(intent);
            }
        });

    }



}



