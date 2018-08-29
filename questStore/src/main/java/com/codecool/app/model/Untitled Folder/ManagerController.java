package com.codecool.app.model;

import java.util.List;
import java.util.ArrayList;

public class ManagerController{

    private Mentor mentor;
    public List<Mentor> mentors;

    public Mentor createNewMentor(int id, String name, String surname, String email, String phone, String password){
        Mentor mentor = new Mentor(id, name, surname, email, phone, password);
        return mentor;
    }

    public Mentor getMentor(String email){
        for(Mentor mentor : mentors){
            if(mentor.getEmail().equals(email))
                return mentor;
        }
    }

    private List<Mentor> getAllMentors(){
        return mentors;
    }

    private Classroom createClassroom(String name, Mentor mentor, List<Student> students){
        Classroom classroom = new Classroom(name, mentor, students);
        return classroom;
    }


    public void editMentorProfile(Mentor mentor, String name, String surname, String email, String phone, String password){
        mentor.setName(name);
        mentor.setSurname(surname);
        mentor.setEmail(email);
        mentor.setPhone(phone);
        mentor.setPassword(password);
    }

    private void assignClassroom(Classroom classroom, Mentor mentor){
        classroom.addMentor(mentor);
    }

    private Level createLevelOfExperience(String name, int experience){
        Level level = new Level(name, experience);
        return level;
    }

    private void editLevelOfExperience(Level level, String name, int experience){
        level.setName(name);
        level.setExperience(experience);
    }

}