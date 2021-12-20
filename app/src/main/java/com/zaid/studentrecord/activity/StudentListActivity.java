package com.zaid.studentrecord.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.zaid.studentrecord.R;
import com.zaid.studentrecord.adapter.StudentAdapter;
import com.zaid.studentrecord.db.DBHelper;
import com.zaid.studentrecord.model.Student;

import java.util.ArrayList;


public class StudentListActivity extends AppCompatActivity {

    ArrayList<Student> students;
    TextView tvTotal;
    StudentAdapter studentAdapter;
    RecyclerView recyclerView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        tvTotal = findViewById(R.id.tvTotal);
        recyclerView = findViewById(R.id.recyclerView);

        DBHelper dbHelper = new DBHelper(this);
        students = dbHelper.getAllStudents();
        tvTotal.setText("TOTAL STUDENTS - " + students.size());

        for (Student s : students) {
            System.out.println(s.getSno());
        }

        studentAdapter  = new StudentAdapter(students, this );
        recyclerView.setAdapter(studentAdapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(llm);

    }
}