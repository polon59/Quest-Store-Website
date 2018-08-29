package com.codecool.app.model;

public class SingleOwnerArtifact extends Artifact {

    private int id;
    private String name;
    private int price;
    private String description;
    private String category;
    private Student owner;
    private String status;
    private boolean wasUsed;


    public SingleOwnerArtifact(int id, String name, int price, String description, String category, Student owner, String status, boolean wasUsed){
        super(id, name, price, description, category);
        this.owner = owner;
        this.status = status;
        this.wasUsed = wasUsed;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getWasUsed(){
        return wasUsed;
    }

    public void useArtifact(){
        wasUsed = true;
    }


}
