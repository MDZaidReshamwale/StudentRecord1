package com.zaid.studentrecord.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.zaid.studentrecord.R;

public class AddStudentActivity extends AppCompatActivity {

//   Declaring variable
    EditText edName, edId, edMNumber, edAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        edId = findViewById(R.id.edID);
        edName = findViewById(R.id.edName);
        edMNumber = findViewById(R.id.edMobileNumber);
        edAddress = findViewById(R.id.edAddress);
    }


    public void showAll(View view) {
        startActivity(new Intent(AddStudentActivity.this,StudentListActivity.class));
    }

    public void save(View view) {
        String id = edId.getText().toString().trim();
        String name = edName.getText().toString().trim();
        String address = edAddress.getText().toString().trim();
        String mnumber = edMNumber.getText().toString().trim();

    }

}