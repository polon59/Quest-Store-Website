package com.codecool.app.model;

public class Manager extends User {

    private Mentor mentor;

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;

    public Manager(int id, String name, String surname, String email, String phone, String password){
        super(id, name, surname, email, phone, password);
    }

    @Override
    public int getUserId() {
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

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getPassword() {
        return password;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}