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

    public getIDClassroom(){
        return this.idClassroom;
    }

    public getName(){
        return this.name;
    }

}