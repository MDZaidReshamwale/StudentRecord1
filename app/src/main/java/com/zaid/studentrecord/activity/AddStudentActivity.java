package com.zaid.studentrecord.activity;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zaid.studentrecord.R;
import com.zaid.studentrecord.db.DBHelper;
import com.zaid.studentrecord.model.Student;

public class AddStudentActivity extends AppCompatActivity {

//   Declaring variable
    EditText edName, edSno, edMNumber, edAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        edSno = findViewById(R.id.edSNo);
        edName = findViewById(R.id.edName);
        edMNumber = findViewById(R.id.edMobileNumber);
        edAddress = findViewById(R.id.edAddress);
    }


    public void showAll(View view) {
        startActivity(new Intent(AddStudentActivity.this,StudentListActivity.class));
    }

    public void save(View view) {
        String sno = edSno.getText().toString().trim();
        String name = edName.getText().toString().trim();
        String address = edAddress.getText().toString().trim();
        String mnumber = edMNumber.getText().toString().trim();

//        -----------------
        Student s = new Student(Integer.parseInt(sno), name, address, Integer.parseInt(mnumber));

        DBHelper dbHelper = new DBHelper(AddStudentActivity.this);
        long result = dbHelper.addStudent(sno, name, address, mnumber );

        if (result > 0){
            Toast.makeText(this,"Saved" + result,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Failed" + result,Toast.LENGTH_SHORT).show();

        }
    }

}