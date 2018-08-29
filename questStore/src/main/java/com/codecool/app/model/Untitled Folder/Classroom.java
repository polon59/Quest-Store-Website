package com.codecool.app.model;

import java.util.List;
import java.util.ArrayList;

public class Classroom{
    
    private String name;
    private Mentor mentor;
    private List<Mentor> mentors;
    private List<Student> students;
    
    public Classroom(String name, Mentor mentor, List<Student> students){
        this.name = name;
        this.mentor = mentor;
        this.students = students;
    }

    public List<Mentor> getMentors(){
        return mentors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeMentor(Mentor mentor){
        mentors.remove(mentor);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

}