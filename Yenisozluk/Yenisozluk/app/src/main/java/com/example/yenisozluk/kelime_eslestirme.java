package com.example.yenisozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class kelime_eslestirme extends AppCompatActivity {

    View va = null;
    String secilenkelime;
    String sonsecilenkelime;
    int puan=0;
    int random;
   String bir;
   String iki;
   String uc;
   String dort;
   String bes;
   String alti;
   String one;
   String two;
   String three;
   String four;
   String five;
   String six;

    private void renksifirla(Button a1,Button a2,Button a3,Button a4,Button a5,Button a6,Button a7,Button a8,Button a9,Button a10,Button a11,Button a12) {

        a1.setBackgroundResource(R.drawable.buttonshape);
        a2.setBackgroundResource(R.drawable.buttonshape);
        a3.setBackgroundResource(R.drawable.buttonshape);
        a4.setBackgroundResource(R.drawable.buttonshape);
        a5.setBackgroundResource(R.drawable.buttonshape);
        a6.setBackgroundResource(R.drawable.buttonshape);
        a7.setBackgroundResource(R.drawable.buttonshape);
        a8.setBackgroundResource(R.drawable.buttonshape);
        a9.setBackgroundResource(R.drawable.buttonshape);
        a10.setBackgroundResource(R.drawable.buttonshape);
        a11.setBackgroundResource(R.drawable.buttonshape);
        a12.setBackgroundResource(R.drawable.buttonshape);

    }
    private void gorunur(Button a1,Button a2,Button a3,Button a4,Button a5,Button a6,Button a7,Button a8,Button a9,Button a10,Button a11,Button a12){
        a1.setVisibility(View.VISIBLE);
        a2.setVisibility(View.VISIBLE);
        a3.setVisibility(View.VISIBLE);
        a4.setVisibility(View.VISIBLE);
        a5.setVisibility(View.VISIBLE);
        a6.setVisibility(View.VISIBLE);
        a7.setVisibility(View.VISIBLE);
        a8.setVisibility(View.VISIBLE);
        a9.setVisibility(View.VISIBLE);
        a10.setVisibility(View.VISIBLE);
        a11.setVisibility(View.VISIBLE);
        a12.setVisibility(View.VISIBLE);
    }
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
        setContentView(R.layout.activity_kelime_eslestirme);
        final kelime_array yenirenk=new kelime_array();

        final Button kelimetr1 = (Button) findViewById(R.id.kelimetr1);
        final Button kelimetr2 = (Button) findViewById(R.id.kelimetr2);
        final Button kelimetr3 = (Button) findViewById(R.id.kelimetr3);
        final Button kelimetr4 = (Button) findViewById(R.id.kelimetr4);
        final Button kelimetr5 = (Button) findViewById(R.id.kelimetr5);
        final Button kelimetr6 = (Button) findViewById(R.id.kelimetr6);
        final Button kelimeen1 = (Button) findViewById(R.id.kelimeen1);
        final Button kelimeen2 = (Button) findViewById(R.id.kelimeen2);
        final Button kelimeen3 = (Button) findViewById(R.id.kelimeen3);
        final Button kelimeen4 = (Button) findViewById(R.id.kelimeen4);
        final Button kelimeen5 = (Button) findViewById(R.id.kelimeen5);
        final Button kelimeen6 = (Button) findViewById(R.id.kelimeen6);
        final Button yenile = (Button) findViewById(R.id.yenile);
        final TextView skor= (TextView)findViewById(R.id.skor);


        random = new Random().nextInt(75);
        bir=String.valueOf(yenirenk.birlesmistr(random));
        one=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        iki=String.valueOf(yenirenk.birlesmistr(random));
        two=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        uc=String.valueOf(yenirenk.birlesmistr(random));
        three=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        dort=String.valueOf(yenirenk.birlesmistr(random));
        four=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        bes=String.valueOf(yenirenk.birlesmistr(random));
        five=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        alti=String.valueOf(yenirenk.birlesmistr(random));
        six=String.valueOf(yenirenk.birlesmisen(random));
        final int sec =new Random().nextInt(3);

        switch (sec) {
            case 0:
                kelimetr1.setText(bir);
                kelimeen2.setText(one);
                kelimetr2.setText(iki);
                kelimeen3.setText(two);
                kelimetr3.setText(uc);
                kelimeen4.setText(three);
                kelimetr4.setText(dort);
                kelimeen6.setText(four);
                kelimetr5.setText(bes);
                kelimeen5.setText(five);
                kelimetr6.setText(alti);
                kelimeen1.setText(six);
                break;
            case 1:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen5.setText(one);
                kelimeen4.setText(two);
                kelimeen2.setText(three);
                kelimeen1.setText(four);
                kelimeen3.setText(five);
                kelimeen6.setText(six);
                break;
            case 2:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen3.setText(one);
                kelimeen1.setText(two);
                kelimeen6.setText(three);
                kelimeen5.setText(four);
                kelimeen4.setText(five);
                kelimeen2.setText(six);
                break;
            case 3:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen4.setText(one);
                kelimeen2.setText(two);
                kelimeen1.setText(three);
                kelimeen3.setText(four);
                kelimeen6.setText(five);
                kelimeen5.setText(six);
                break;
        }



        kelimetr1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        secilenkelime= String.valueOf(kelimetr1.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
        {
            System.out.println("Bildin");
            kelimetr1.setVisibility(View.INVISIBLE);
            va.setVisibility(View.INVISIBLE);
            puan++;
            skor.setText(String.valueOf(puan));
            PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();

        }
        else if(secilenkelime==null ||sonsecilenkelime==null){
            kelimetr1.setBackgroundResource(R.drawable.buttonshapedogru);

        }
        else if(secilenkelime==sonsecilenkelime){
            kelimetr1.setBackgroundResource(R.drawable.buttonshapedogru);}
        else{
            kelimetr1.setBackgroundResource(R.drawable.buttonshapedogru);
            va.setBackgroundResource(R.drawable.buttonshape);

        }
        sonsecilenkelime=String.valueOf(kelimetr1.getText());
      va=kelimetr1;

    }
});
kelimeen1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        secilenkelime= String.valueOf(kelimeen1.getText());
        if (secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
        {
            System.out.println("Bildin");
            secilenkelime=null;
            sonsecilenkelime=null;
            va.setVisibility(View.INVISIBLE);
            kelimeen1.setVisibility(View.INVISIBLE);
            puan++;
            skor.setText(String.valueOf(puan));
            PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();}
        else if(secilenkelime==null ||sonsecilenkelime==null){
            kelimeen1.setBackgroundResource(R.drawable.buttonshapedogru);

        }
        else if(secilenkelime==sonsecilenkelime){
            kelimeen1.setBackgroundResource(R.drawable.buttonshapedogru);}
        else{
            kelimeen1.setBackgroundResource(R.drawable.buttonshapedogru);
            va.setBackgroundResource(R.drawable.buttonshape);
        }
        sonsecilenkelime=String.valueOf(kelimeen1.getText());
        va=kelimeen1;
    }
});

        kelimetr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimetr2.getText());
                if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimetr2.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
                else if(secilenkelime==null || sonsecilenkelime==null){
                    kelimetr2.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                else if(secilenkelime==sonsecilenkelime){
                    kelimetr2.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimetr2.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);}
                sonsecilenkelime=String.valueOf(kelimetr2.getText());
                va=kelimetr2;
            }
        });
        kelimeen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimeen2.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimeen2.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimeen2.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimeen2.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimeen2.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimeen2.getText());
                va=kelimeen2;
            }
        });
        kelimetr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimetr3.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimetr3.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
                else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimetr3.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimetr3.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimetr3.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimetr3.getText());
                va=kelimetr3;
            }
        });
        kelimeen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimeen3.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimeen3.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
              else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimeen3.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimeen3.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    va.setBackgroundResource(R.drawable.buttonshape);
                    kelimeen3.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                sonsecilenkelime=String.valueOf(kelimeen3.getText());
                va=kelimeen3;
            }
        });
        kelimetr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimetr4.getText());

        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimetr4.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
               else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimetr4.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimetr4.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimetr4.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimetr4.getText());
                va=kelimetr4;
            }
        });
        kelimeen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimeen4.getText());
         if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimeen4.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
               else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimeen4.setBackgroundResource(R.drawable.buttonshapedogru);
                }
         else if(secilenkelime==sonsecilenkelime){
             kelimeen4.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimeen4.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimeen4.getText());
                va=kelimeen4;
            }
        });
        kelimetr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimetr5.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimetr5.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
                else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimetr5.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimetr5.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimetr5.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimetr5.getText());
                va=kelimetr5;
            }
        });
            kelimeen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimeen5.getText());
        if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimeen5.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
                else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimeen5.setBackgroundResource(R.drawable.buttonshapedogru);
                }
        else if(secilenkelime==sonsecilenkelime){
            kelimeen5.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimeen5.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimeen5.getText());
                va=kelimeen5;
            }
        });
        kelimetr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimetr6.getText());
          if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime||
                        secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime
                       )
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimetr6.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
               else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimetr6.setBackgroundResource(R.drawable.buttonshapedogru);
                }
          else if(secilenkelime==sonsecilenkelime){
              kelimetr6.setBackgroundResource(R.drawable.buttonshapedogru);}
                else{
                    kelimetr6.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimetr6.getText());
                va=kelimetr6;
            }
        });
        kelimeen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenkelime= String.valueOf(kelimeen6.getText());
         if(secilenkelime == bir && one==sonsecilenkelime || iki==secilenkelime && two==sonsecilenkelime || uc==secilenkelime && three==sonsecilenkelime
                        || dort==secilenkelime && four==sonsecilenkelime|| bes==secilenkelime && five==sonsecilenkelime|| alti==secilenkelime && six==sonsecilenkelime
                        ||secilenkelime == one && bir==sonsecilenkelime || two==secilenkelime && iki==sonsecilenkelime || three==secilenkelime && uc==sonsecilenkelime
                        || four==secilenkelime && dort==sonsecilenkelime|| five==secilenkelime && bes==sonsecilenkelime|| six==secilenkelime && alti==sonsecilenkelime)
                {
                    System.out.println("Bildin");
                    va.setVisibility(View.INVISIBLE);
                    kelimeen6.setVisibility(View.INVISIBLE);
                    puan++;
                    skor.setText(String.valueOf(puan));
                    PreferenceManager.Instance(getApplicationContext()).Arttireslestirme();
                }
                else if(secilenkelime==null ||sonsecilenkelime==null){
                    kelimeen6.setBackgroundResource(R.drawable.buttonshapedogru);
                }
                else if(secilenkelime==sonsecilenkelime){
             kelimeen6.setBackgroundResource(R.drawable.buttonshapedogru);
         }
                else{
                   kelimeen6.setBackgroundResource(R.drawable.buttonshapedogru);
                    va.setBackgroundResource(R.drawable.buttonshape);
                }
                sonsecilenkelime=String.valueOf(kelimeen6.getText());
                va=kelimeen6;
            }
        });

yenile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        puan=0;
skor.setText("0");
        renksifirla(kelimetr1,kelimeen2,kelimetr2,kelimeen3,kelimetr3,kelimeen4,kelimetr4,kelimeen6,kelimetr5,kelimeen5,kelimetr6,kelimeen1);
        gorunur(kelimetr1,kelimeen2,kelimetr2,kelimeen3,kelimetr3,kelimeen4,kelimetr4,kelimeen6,kelimetr5,kelimeen5,kelimetr6,kelimeen1);

        random = new Random().nextInt(75);
        bir=String.valueOf(yenirenk.birlesmistr(random));
        one=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        iki=String.valueOf(yenirenk.birlesmistr(random));
        two=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        uc=String.valueOf(yenirenk.birlesmistr(random));
        three=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        dort=String.valueOf(yenirenk.birlesmistr(random));
        four=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        bes=String.valueOf(yenirenk.birlesmistr(random));
        five=String.valueOf(yenirenk.birlesmisen(random));
        random = new Random().nextInt(75);
        alti=String.valueOf(yenirenk.birlesmistr(random));
        six=String.valueOf(yenirenk.birlesmisen(random));
        int sec =new Random().nextInt(3);

        switch (sec) {
            case 0:
                kelimetr1.setText(bir);
                kelimeen2.setText(one);
                kelimetr2.setText(iki);
                kelimeen3.setText(two);
                kelimetr3.setText(uc);
                kelimeen4.setText(three);
                kelimetr4.setText(dort);
                kelimeen6.setText(four);
                kelimetr5.setText(bes);
                kelimeen5.setText(five);
                kelimetr6.setText(alti);
                kelimeen1.setText(six);
                break;
            case 1:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen5.setText(one);
                kelimeen4.setText(two);
                kelimeen2.setText(three);
                kelimeen1.setText(four);
                kelimeen3.setText(five);
                kelimeen6.setText(six);
                break;
            case 2:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen3.setText(one);
                kelimeen1.setText(two);
                kelimeen6.setText(three);
                kelimeen5.setText(four);
                kelimeen4.setText(five);
                kelimeen2.setText(six);
                break;
            case 3:
                kelimetr1.setText(bir);
                kelimetr2.setText(iki);
                kelimetr3.setText(uc);
                kelimetr4.setText(dort);
                kelimetr5.setText(bes);
                kelimetr6.setText(alti);
                kelimeen4.setText(one);
                kelimeen2.setText(two);
                kelimeen1.setText(three);
                kelimeen3.setText(four);
                kelimeen6.setText(five);
                kelimeen5.setText(six);
                break;
        }



    }
});


    }

}
