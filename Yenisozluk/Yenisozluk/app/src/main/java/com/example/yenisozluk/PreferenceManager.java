package com.example.yenisozluk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public class PreferenceManager extends Activity {
    private static volatile PreferenceManager _instance = null;
    public static SharedPreferences _preferences;
    public static SharedPreferences.Editor _editor;
    private static Context ctx;

    public PreferenceManager(Context ctx)
    {
        if(_instance != null)
             throw new RuntimeException("Lütfen Instance() fonksiyonunu kullanınız");
        else{
            _preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(ctx);
            _editor = _preferences.edit();
        }
    }
public PreferenceManager (){

    }
    public static PreferenceManager Instance(Context ctx)
    {
        if(_instance == null)
        {
            synchronized (PreferenceManager.class)
            {

                _instance = new PreferenceManager(ctx);
            }
        }
        return _instance;
    }

    public void ArttirCoktanSecmeli()
    {
        _editor.putInt("coktansecmeli",_preferences.getInt("coktansecmeli",0) + 1);
        _editor.commit();
    }

    public int CekCoktanSecmeli(){
        return _preferences.getInt("coktansecmeli",0);
    }
    public void ArttirBoslukDoldurma()
    {
        _editor.putInt("boslukdoldurma",_preferences.getInt("boslukdoldurma",0) + 1);
        _editor.commit();
    }

    public int CekBoslukDoldurma(){
        return _preferences.getInt("boslukdoldurma",0);
    }
    public void ArttirKendinyaz()
    {
        _editor.putInt("kendinyaz",_preferences.getInt("kendinyaz",0) + 1);
        _editor.commit();
    }

    public int CekKendinyaz(){
        return _preferences.getInt("kendinyaz",0);
    }
    public void Arttirezberle()
    {
        _editor.putInt("ezberle",_preferences.getInt("ezberle",0) + 1);
        _editor.commit();
    }

    public int Cekezberle(){
        return _preferences.getInt("ezberle",0);
    }
    public void Arttireslestirme()
    {
        _editor.putInt("eslestirme",_preferences.getInt("eslestirme",0) + 1);
        _editor.commit();
    }

    public int Cekeslestirme(){
        return _preferences.getInt("eslestirme",0);
    }
    public boolean setdatainfo(){
        return _preferences.getBoolean("datainfo",false);
    }
    public void cekdatainfo(){
        _editor.putBoolean("datainfo",_preferences.getBoolean("datainfo",true));
        _editor.commit();
    }








}

