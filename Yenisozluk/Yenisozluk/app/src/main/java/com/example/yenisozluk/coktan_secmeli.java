package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class coktan_secmeli extends AppCompatActivity {
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
    String yanlis1;
    String yanlis2;
    String yanlis3;
    String dogruen;
    int random = new Random().nextInt(75);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coktan_secmeli);


        final TextView text=(TextView) findViewById(R.id.text);
        final kelime_array yenirenk=new kelime_array();
        final Button cevap_1 = (Button) findViewById(R.id.cevap_1);
        final Button cevap_2 = (Button) findViewById(R.id.cevap_2);
        final Button cevap_3 = (Button) findViewById(R.id.cevap_3);
        final Button cevap_4 = (Button) findViewById(R.id.cevap_4);
        final Button sonraki_soru = (Button) findViewById(R.id.sonraki_soru);

        dogrutr=String.valueOf(yenirenk.birlesmistr(random));
        text.setText(dogrutr);
        int sec =new Random().nextInt(3);
        System.out.println(sec);
        if(sec==0)
        {
            dogruen=String.valueOf(yenirenk.birlesmisen(random));
            cevap_1.setText(dogruen);
            int yeni=new Random().nextInt(75);
            yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_2.setText(yanlis1);
            yeni=new Random().nextInt(75);
            yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_3.setText(yanlis2);
            yeni=new Random().nextInt(75);
            yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_4.setText(yanlis3);
        }
        else if(sec==1)
        {
            dogruen=String.valueOf(yenirenk.birlesmisen(random));
            cevap_2.setText(dogruen);
            int yeni=new Random().nextInt(75);
            yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_1.setText(yanlis1);
            yeni=new Random().nextInt(75);
            yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_3.setText(yanlis2);
            yeni=new Random().nextInt(75);
            yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_4.setText(yanlis3);
        }
        else if(sec==2){
            dogruen=String.valueOf(yenirenk.birlesmisen(random));
            cevap_3.setText(dogruen);
            int yeni=new Random().nextInt(75);
            yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_2.setText(yanlis1);
            yeni=new Random().nextInt(75);
            yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_1.setText(yanlis2);
            yeni=new Random().nextInt(75);
            yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_4.setText(yanlis3);
        }
        else if(sec==3)
        {
            dogruen=String.valueOf(yenirenk.birlesmisen(random));
            cevap_4.setText(dogruen);
            int yeni=new Random().nextInt(75);
            yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_2.setText(yanlis1);
            yeni=new Random().nextInt(75);
            yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_3.setText(yanlis2);
            yeni=new Random().nextInt(75);
            yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
            cevap_1.setText(yanlis3);
        }
        cevap_1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(cevap_1.getText()==String.valueOf(yenirenk.birlesmisen(random)))
        {
            System.out.println("Doğru");
            PreferenceManager.Instance(getApplicationContext()).ArttirCoktanSecmeli();
            cevap_1.setBackgroundResource(R.drawable.buttonshapedogru);
        }
        else {
            System.out.println("Yanlış");

            cevap_1.setBackgroundResource(R.drawable.buttonshapeyanlis);
        }

    }
      /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
});
        cevap_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevap_2.getText()==String.valueOf(yenirenk.birlesmisen(random)))
                {
                    System.out.println("Doğru");
                    PreferenceManager.Instance(getApplicationContext()).ArttirCoktanSecmeli();
                    cevap_2.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                else {
                    System.out.println("Yanlış");

                    cevap_2.setBackgroundResource(R.drawable.buttonshapeyanlis);
                }
            }
        });
        cevap_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevap_3.getText()==String.valueOf(yenirenk.birlesmisen(random)))
                {
                    System.out.println("Doğru");
                    PreferenceManager.Instance(getApplicationContext()).ArttirCoktanSecmeli();
                    cevap_3.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                else {
                    System.out.println("Yanlış");

                    cevap_3.setBackgroundResource(R.drawable.buttonshapeyanlis);
                }
            }
        });
        cevap_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevap_4.getText()==String.valueOf(yenirenk.birlesmisen(random)))
                {
                    System.out.println("Doğru");
                    PreferenceManager.Instance(getApplicationContext()).ArttirCoktanSecmeli();
                    cevap_4.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                else {
                    System.out.println("Yanlış");

                    cevap_4.setBackgroundResource(R.drawable.buttonshapeyanlis);
                }
            }
        });
        sonraki_soru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = new Random().nextInt(75);
                cevap_1.setBackgroundResource(R.drawable.buttonshape);
                cevap_2.setBackgroundResource(R.drawable.buttonshape);
                cevap_3.setBackgroundResource(R.drawable.buttonshape);
                cevap_4.setBackgroundResource(R.drawable.buttonshape);
                dogrutr=String.valueOf(yenirenk.birlesmistr(random));
                text.setText(dogrutr);
                int sec =new Random().nextInt(3);
                if(sec==0)
                {
                    dogruen=String.valueOf(yenirenk.birlesmisen(random));
                    cevap_1.setText(dogruen);
                    int yeni=new Random().nextInt(75);
                    yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_2.setText(yanlis1);
                    yeni=new Random().nextInt(75);
                    yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_3.setText(yanlis2);
                    yeni=new Random().nextInt(75);
                    yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_4.setText(yanlis3);
                }
                else if(sec==1)
                {
                    dogruen=String.valueOf(yenirenk.birlesmisen(random));
                    cevap_2.setText(dogruen);
                    int yeni=new Random().nextInt(75);
                    yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_1.setText(yanlis1);
                    yeni=new Random().nextInt(75);
                    yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_3.setText(yanlis2);
                    yeni=new Random().nextInt(75);
                    yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_4.setText(yanlis3);
                }
                else if(sec==2){
                    dogruen=String.valueOf(yenirenk.birlesmisen(random));
                    cevap_3.setText(dogruen);
                    int yeni=new Random().nextInt(75);
                    yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_2.setText(yanlis1);
                    yeni=new Random().nextInt(75);
                    yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_1.setText(yanlis2);
                    yeni=new Random().nextInt(75);
                    yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_4.setText(yanlis3);
                }
                else if(sec==3)
                {
                    dogruen=String.valueOf(yenirenk.birlesmisen(random));
                    cevap_4.setText(dogruen);
                    int yeni=new Random().nextInt(75);
                    yanlis1=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_2.setText(yanlis1);
                    yeni=new Random().nextInt(75);
                    yanlis2=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_3.setText(yanlis2);
                    yeni=new Random().nextInt(75);
                    yanlis3=String.valueOf(yenirenk.birlesmisen(yeni));
                    cevap_1.setText(yanlis3);
                }



            }
        });
    }}

