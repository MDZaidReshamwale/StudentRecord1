package com.zaid.studentrecord.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zaid.studentrecord.R;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    Thread th = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    try{
                        Thread.sleep(200);
                        startActivity(new Intent(StudentActivity.this, AddStudentActivity.class));
                        finish();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
    );

    public void Next(View view) {
        Intent i = new Intent(this, AddStudentActivity.class);
        startActivity(i);
    }
}