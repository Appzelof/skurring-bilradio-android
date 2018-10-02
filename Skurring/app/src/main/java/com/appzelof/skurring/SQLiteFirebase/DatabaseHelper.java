package com.appzelof.skurring.SQLiteFirebase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "firebaseStations";
    public static final String RADIONAME = "radioName";
    public static final String RADIOIMAGE = "radioImage";
    public static final String RADIOURL = "radioUrl";

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "firebaseStations.db";

    private static final String DATABASE_CREATE = "create table " + TABLE_NAME + "(" + RADIONAME +
            " varchar(255) not null, " + RADIOIMAGE +
            " int not null, " + RADIOURL +
            " varchar(255) not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}

