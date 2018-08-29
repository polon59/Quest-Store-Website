import java.util.List;
import java.util.ArrayList;

public class Classroom{
    
    private String name;
    private int idClassroom = Integer.MAX_VALUE;
    
    public Classroom(String name, int idClassroom){
        this.name = name;
        this.idClassroom = idClassroom;
    }

    public Classroom(String name){
        this.name = name;
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

    public void setNewId(int id){
        this.idClassroom = id;
    }

}