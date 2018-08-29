package com.codecool.app.model;

public class Student extends User{

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private Classroom classroom;

    public Student(int id, String name, String surname, String email, String phone, String password, Classroom classroom){
        super(id, name, surname, email, phone, password);
        this.classroom = classroom;
    }


}