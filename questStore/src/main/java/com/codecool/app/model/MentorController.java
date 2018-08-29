package com.codecool.app.model;

public class MentorController {

    private Student student;
    private Classroom classroom;
    private Quest quest;
    private AssignedQuest assignedQuest;
    private Artifact artifact;
    //private List<Student> students

    private Student createStudent(int id, String name, String surname, String email, String phone, String password, Classroom classroom){
        Student student = new Student(id, name, surname, email, phone, password, classroom);
    }

    private Student getStudent(String email){
        for(Student student : students){
            if(student.getEmail().equals(email))
                return student;
        }
    }

    private void editStudentData(Student student, String name, String surname, String email, String phone, String password, Classroom classroom){
        student.setName(name);
        student.setSurname(surname);
        student.setEmail(email);
        student.setPhone(phone);
        student.setPassword(password);
        student.setClassroom(classroom);
    }

    private Artifact createArtifact(int id, String name, int price, String description, String category){
        Artifact artifact = new Artifact(id, name, price, description, category);
    }

    private void assignToClass(Student student, Classroom classroom){
        classroom.addStudent(student);
    }

    private void removeFromClass(Student student, Classroom classroom){
        classroom.removeStudent(student);
    }




}
