package com.zaid.studentrecord.model;

public class Student {
    int id;
    int sno;
    String name;
    String address;
    int mnumber;


    public Student(int sno, String name, String address, int mnumber) {
        this.sno = sno;
        this.name = name;
        this.address = address;
        this.mnumber = mnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMnumber() {
        return mnumber;
    }

    public void setMnumber(int mnumber) {
        this.mnumber = mnumber;
    }
}