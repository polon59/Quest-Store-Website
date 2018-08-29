package com.codecool.app.model;

public class Level {

    //public List<Level> levels
    private String name;
    private int experience;

    public Level(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
