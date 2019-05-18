package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class kendin_yaz extends AppCompatActivity {
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
    String dogrutr;
    String dogruen;
    int random = new Random().nextInt(17);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendin_yaz);
        final Intent kendinyaz = new Intent(this, kendin_yaz.class);
        final TextView text=(TextView) findViewById(R.id.text);
        final EditText yaz=(EditText) findViewById(R.id.yaz);
        final kelime_array yenirenk=new kelime_array();
        final Button sonraki_soru = (Button) findViewById(R.id.sonraki_soru);
        final Button kontrol = (Button) findViewById(R.id.kontrol);


        dogrutr=String.valueOf(yenirenk.bosluksoru(random));
        dogruen=String.valueOf(yenirenk.boslukcevap(random));
        text.setText(dogrutr);

        kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(((String.valueOf(yaz.getText())).toLowerCase()).equals(dogruen.toLowerCase()))
                {
                    System.out.println("Doğru");
                    PreferenceManager.Instance(getApplicationContext()).ArttirKendinyaz();
                    yaz.setBackgroundColor(0xFF14E910);}
                    else {
                    yaz.setBackgroundColor(0xFFE91030);
                }

            }
        });
        sonraki_soru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yaz.setBackgroundResource(R.drawable.beyaz);
                yaz.setText("");
                random = new Random().nextInt(17);
                dogrutr=String.valueOf(yenirenk.bosluksoru(random));
                dogruen=String.valueOf(yenirenk.boslukcevap(random));
                text.setText(dogrutr);
            }
        });
    }




}
