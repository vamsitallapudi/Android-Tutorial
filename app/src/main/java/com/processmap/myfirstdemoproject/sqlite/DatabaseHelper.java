package com.processmap.myfirstdemoproject.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vamsitallapudi on 08/11/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "News.db";
    public static final String TABLE_NAME = "News";
    public static final String COLUMN_ID = "Id";
    public static final String COLUMN_NEWS_TITLE = "news_title";
    public static final String COLUMN_IMAGE_URL = "news_image_url";
    public static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }

    //Creating Database Table
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //create statement is "create table TABLE_NAME (Id INTEGER PRIMARY KEY AUTOINCREMENT, news_title TEXT, news_image_url text)"
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NEWS_TITLE + " TEXT,"+ COLUMN_IMAGE_URL + " TEXT"+ ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    //Inserting data
    public boolean insertData(String news_title, String news_image_url) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NEWS_TITLE, news_title);
        contentValues.put(COLUMN_IMAGE_URL, news_image_url);
        long result = sqLiteDatabase.insert(TABLE_NAME,null, contentValues);
        //above insert method returns -1 if fails
        return !(result==-1);
    }

    public Cursor readData(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.rawQuery("select * from " + TABLE_NAME, null);
    }
}
