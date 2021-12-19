package com.zaid.studentrecord.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper( Context context) {
        super(context, "zaid.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        Writing to Database query to create table
        sqLiteDatabase.execSQL("CREATE TABLE tbl_student (id INTEGER PRIMARY KEY AUTOINCREMENT, sno INTEGER,name text, address text, mobile INTEGER )");
    }

    @Override

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS tbl_student");
        onCreate(sqLiteDatabase);
    }

    public long addStudent(String sno, String name, String address, String mnumber) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("sno", sno);
        cv.put("name", name);
        cv.put("address", address);
        cv.put("mobile", mnumber);

        return db.insert("tbl_student",null,cv);

    }
}
