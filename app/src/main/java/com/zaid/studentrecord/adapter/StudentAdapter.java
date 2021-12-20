package com.zaid.studentrecord.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.zaid.studentrecord.R;
import com.zaid.studentrecord.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVH> {

    ArrayList<Student> students;
    Context context;

    public StudentAdapter(ArrayList<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_student,parent,false);
        StudentVH svh = new StudentVH(view);
        return svh;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVH holder, int position) {

        Student s  = students.get(position);
        holder.tvName.setText(s.getName());
        holder.tvSno.setText(String.valueOf(s.getSno()));
        holder.tvAddress.setText(s.getAddress());
        holder.tvMobile.setText(String.valueOf(s.getMnumber()));

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentVH extends RecyclerView.ViewHolder{

        TextView tvName, tvSno, tvAddress, tvMobile;
        CardView cardUpdate, cardDelete;

        public StudentVH(@NonNull View v) {
            super(v);

            tvName = v.findViewById(R.id.tvName);
            tvSno = v.findViewById(R.id.tvSno);
            tvAddress = v.findViewById(R.id.tvAddress);
            tvMobile = v.findViewById(R.id.tvMobile);

            cardDelete = v.findViewById(R.id.cardDelete);
            cardUpdate = v.findViewById(R.id.cardUpdate);
        }
    }
}
