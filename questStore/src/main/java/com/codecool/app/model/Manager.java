// package com.codecool.app.model;

public class Manager extends User {

    private int managerId;
    private Mentor mentor;

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;


    public Manager(int managerId, int id, String name, String surname, String email, String phone, String password) {
        super(id, name, surname, email, phone, password);
    }
}