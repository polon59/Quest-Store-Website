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

    @Override
    public int getUserID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}