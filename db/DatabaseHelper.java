package com.example.aomek.piggold.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "book.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "book";
    public static final String COL_ID = "_id";
    public static final String COL_DATE = "date";
    public static final String COL_NUMBER = "number";
    public static final String COL_TYPE = "type";

    private static final String SQL_CREATE_TABLE_PHONE
            = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_DATE + " TEXT,"
            + COL_NUMBER + " TEXT,"
            + COL_TYPE + " TEXT"
            + ")";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_PHONE);

        ContentValues cv = new ContentValues();
        cv.put(COL_DATE, "2018-12");
        cv.put(COL_NUMBER, "1669");
        cv.put(COL_TYPE, "เดินทาง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_DATE, "2018-12");
        cv.put(COL_NUMBER, "1646");
        cv.put(COL_TYPE, "อาหาร");
        db.insert(TABLE_NAME, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} // ปิดคลาส DatabaseHelper