package com.zaid.studentrecord.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zaid.studentrecord.R;
import com.zaid.studentrecord.model.Student;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {

    ArrayList<Student> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);


    }
}