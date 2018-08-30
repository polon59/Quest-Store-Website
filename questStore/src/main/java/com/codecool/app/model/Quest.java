package com.codecool.app.model;

public class Quest {

    private int id;
    private String name;
    private int reward;
    private String description;
    private String category;


    public Quest(int id, String name, int reward, String description, String category) {
        this.id = id;
        this.name = name;
        this.reward = reward;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getReward() {
        return reward;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
