package com.example.yenisozluk;


import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

private android.speech.tts.TextToSpeech tts;
public SharedPreferences mPreferences;
public SharedPreferences.Editor mEditor;
DataBaseHelper dbHelper;
String kelime;
int dil=2; // Uygulama ingilizceden türkçeye çeviri ile başladığı için
static int ceviri_sayisi=0;
static boolean data=false;


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
        dbHelper = new DataBaseHelper(getApplicationContext());
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView textView = (TextView) findViewById(R.id.text);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        Button button2 = (Button) findViewById(R.id.button2);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        Button dildegis = (Button) findViewById(R.id.dildegis);
        if(!(com.example.yenisozluk.PreferenceManager.Instance(this).setdatainfo())) {
            dbHelper.ReadAllData(this); //csv yi okutmak için bir kere calıstır yeter
            com.example.yenisozluk.PreferenceManager.Instance(this).cekdatainfo();
        }
        //dbHelper.DeleteAll();  //csv yi silmek için

        System.out.println("Merhaba");
        final Button bspeak = (Button) findViewById(R.id.bspeak);
        bspeak.setVisibility(View.INVISIBLE); //ses butonu başta görünmez

        mPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        mEditor=mPreferences.edit();
        mEditor.putInt("puan",ceviri_sayisi++);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) ;
                {
                    int result = tts.setLanguage(Locale.UK);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Dil desteklenmiyor");
                    } else {

                        bspeak.setEnabled(true);
                    }
                }

            }

        });

        bspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
            public void speak () {
                String deneme = String.valueOf((dbHelper.Translate(kelime, dil)));
                if((dbHelper.Translate(kelime, dil))==null){
                    System.out.println("Null du");
                }else {
                    tts.speak(deneme, TextToSpeech.QUEUE_FLUSH, null);
                }

            }
        });

        dildegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Tıklandığında resim,yazı ve çevirilecek dili değiştir.
                if (dil == 2) {
                    bspeak.setVisibility(View.VISIBLE);
                    dil = 1;
                    textView3.setText("EN");
                    textView2.setText("TR");
                    imageView.setImageResource(R.drawable.ingiltere);
                    imageView2.setImageResource(R.drawable.turk);
                    textView.setText("");


                } else {

                    bspeak.setVisibility(View.INVISIBLE);
                    textView3.setText("TR");
                    textView2.setText("EN");
                    imageView2.setImageResource(R.drawable.ingiltere);
                    imageView.setImageResource(R.drawable.turk);
                    textView.setText("");
                    dil=2;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kelime = editText.getText().toString().toLowerCase(); //girilen kelimeyi lowercase string e çevir
                if ((dbHelper.Translate(kelime, dil) == null)) { //boş veya veritabanında olup olmadığını kontrol et
                    textView.setText("Çeviri bulunamıyor doğru girdiğinizden emin olun");
                } else {
                    String deneme = String.valueOf((dbHelper.Translate(kelime, dil)));  //çeviri metodunu çağırmak için
                    String deneme1 = String.valueOf((deneme.substring(1, deneme.length() - 1))); // [ işaretlerini silmek için
                    final String deneme2 = deneme1.substring(0, 1).toUpperCase() + deneme1.substring(1); //İlk harfi büyük yapmak için
                    textView.setText(deneme2);
                    System.out.println(mPreferences.getInt("puan",ceviri_sayisi++));
                    System.out.println(mPreferences.getAll());
                }
            }
        });

    }
    @Override
    protected void onDestroy() { //TextToSpeech i durdurmak için

        if(tts !=null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }


}