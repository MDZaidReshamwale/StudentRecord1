package com.zaid.studentrecord.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.zaid.studentrecord.model.Student;

import java.util.ArrayList;

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

    public long addStudent(Student s) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("sno", s.getSno());
        cv.put("name", s.getName());
        cv.put("address", s.getAddress());
        cv.put("mobile", s.getMnumber());

        return db.insert("tbl_student",null,cv);

    }

    public ArrayList<Student> getAllStudents(){

    }
}
