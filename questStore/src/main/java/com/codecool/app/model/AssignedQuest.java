package com.codecool.app.model;

public class AssignedQuest extends Quest {

    private int id;
    private String name;
    private int reward;
    private String description;
    private String category;
    private Student owner;
    private boolean wasSubmitted;
    private boolean wasGraded;
    private boolean wasApproved;

    public AssignedQuest(int id, String name, int reward, String description, String category, Student owner, boolean wasSubmitted, boolean wasGraded, boolean wasApproved) {
        super(id, name, reward, description, category);
        this.owner = owner;
        this.wasSubmitted = wasSubmitted;
        this.wasGraded = wasGraded;
        this.wasApproved = wasApproved;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    @Override
    public int getReward() {
        return reward;
    }

    @Override
    public void setReward(int reward) {
        this.reward = reward;
    }

    public boolean getWasSubmitted(){
        return wasSubmitted;
    }

    public void toggleWasSubmitted(){
        wasSubmitted = wasSubmitted ? false : true;
    }

    public boolean getWasGraded(){
        return wasGraded;
    }

    public void toggleWasGraded(){
        wasGraded = wasGraded ? false : true;
    }

    public boolean getWasApproved(){
        return wasApproved;
    }

    public void toggleWasApproved(){
        wasApproved = wasApproved ? false : true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }
}
