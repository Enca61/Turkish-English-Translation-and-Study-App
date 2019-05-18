package com.example.yenisozluk;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataBaseHelper extends SQLiteOpenHelper {

    private String DB_NAME = "database.db";
    private String TABLE_NAME = "dil";
    private SQLiteDatabase mDataBase;
   static ArrayList<String> mArrayList = new ArrayList<String>();


    public DataBaseHelper (Context context){
        super(context, "database.db",null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE dil (asd TEXT,asd1 TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS dil");
        onCreate(db);
    }

    public void Insert(String a,String b)
    {
        mDataBase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("asd",a);
        contentValues.put("asd1",b);
        mDataBase.insert(TABLE_NAME,null,contentValues);
    }

    public ArrayList GetAll() //csv dosyasını okutmak için
    {
        ArrayList a = new ArrayList();
        mDataBase = this.getReadableDatabase();
        Cursor c = mDataBase.rawQuery("SELECT * FROM dil" ,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {
            a.add(c.getString(0) + " " +c.getString(1));
            c.moveToNext();
        }
        return a;
    }

    public ArrayList<String> Translate(String data, int language) { //çeviri arraylist çoklu çeviri alması için
        String currentLang = null;
        String toLang = null;
        switch (language) {
            //To English
            case 1:
                currentLang = "asd1";
                toLang = "asd";
                break;
            //To Turkish
            case 2:
                currentLang = "asd";
                toLang = "asd1";
        }
        mDataBase = getReadableDatabase();
        String sql = "SELECT " + toLang + " FROM dil WHERE " + currentLang + "=\'" + data + "\'";
        Cursor c = mDataBase.rawQuery(sql, null);


        if (c.getCount() == 0) { //boş ise null döndür
            System.out.println("0 a eşitti");
            return null;

        } else {
            mArrayList.clear(); // Ard arda basılınca aynı çeviriyi yüklemeyi önler
            for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) { //Cursor ilerleyerek değerleri arraylist e ekliyor
                mArrayList.add(c.getString(c.getColumnIndex(toLang)));
            }
        }

        return mArrayList;
    }


    public void ReadAllData(Context ctx){
        SQLiteDatabase db = this.getWritableDatabase();
        String filename= "birlesmis.csv";
        AssetManager manager = ctx.getAssets();
        InputStream inStream = null;

        try {
            inStream = manager.open(filename);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(inStream));
            String line;
            String tableName = TABLE_NAME;
            String columns = "asd, asd1";
            String str1 = "INSERT INTO " + tableName + " (" + columns + ") values(";
            String str2 = ");";

            db.beginTransaction();
            while((line = buffer.readLine()) != null)
            {
                StringBuilder sb = new StringBuilder(str1);
                String[] str = line.split(";");
                sb.append("\"" + str[0] + "\",\"");
                sb.append(str[1] + "\"");
                sb.append(str2);
                db.execSQL(sb.toString());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        db.setTransactionSuccessful();
        db.endTransaction();


    }

    public void DeleteAll()
    {
        mDataBase = this.getWritableDatabase();
        mDataBase.execSQL("DELETE FROM dil");
    }


}






