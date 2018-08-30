package com.codecool.app.model;

import java.util.List;
import java.util.ArrayList;

public class Classroom{
    
    private String name;
    private int idClassroom;
    
    public Classroom(String name, int idClassroom){
        this.name = name;
        this.idClassroom = idClassroom;
    }

    public int getIDClassroom(){
        return this.idClassroom;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return name + " " + idClassroom;
    }

}