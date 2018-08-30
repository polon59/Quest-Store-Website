package com.codecool.app.controler;

import com.codecool.app.model.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public class ManagerControler implements HttpHandler {

    private final int firstOnList = 0;
    private final int secondOnList = 1;
    private final int thirdOnList = 2;
    private final int fourthOnList = 3;

    private FactoryDAO fDAO = new FactoryDAO();
    private ManagerDAO managerDAO = fDAO.getManagerDAO();
    private ClassroomDAO classroomDAO = fDAO.getClassroomDAO();

    private Common c = new Common();
    private String[] uri;
    private Mentor mentor;
    public List<Mentor> mentors;



    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getRequestMethod());
        System.out.println(httpExchange.getRequestURI());

        String response = "";
        String method = httpExchange.getRequestMethod();
        String URI = httpExchange.getRequestURI().toString();
        this.uri = Common.parseUri(URI);

        if (method.equals("GET") && uri.length == 2) {
            response = c.getFileWithUtil("html/Manager/indexManager.html");
        }
        if (method.equals("POST") && uri[thirdOnList].equals("addclass")) {
            addNewClass(httpExchange);
            Common.redirect(httpExchange, "/manager");
        }

        Common.sendResponse(httpExchange, response);

    }

    private void addNewClass(HttpExchange httpExchange) throws UnsupportedEncodingException, IOException {
        Map<String, String> data = Common.formatData(httpExchange);
        String className = data.get("classInput").toString();
        classroomDAO.insertNewClassroom("className");
    }


    public Mentor createNewMentor(int id, String name, String surname, String email, String phone, String password){
        Mentor mentor = new Mentor(id, name, surname, email, phone, password);
        return mentor;
    }

    public Mentor getMentor(String email){
        for(Mentor mentor : mentors){
            if(mentor.getEmail().equals(email))
                return mentor;
        }
        return null;
    }

    private List<Mentor> getAllMentors(){
        return mentors;
    }

//    private Classroom createClassroom(String name, Mentor mentor){
//        Classroom classroom = new Classroom(name, mentor);
//        return classroom;
//    }


    public void editMentorProfile(Mentor mentor, String name, String surname, String email, String phone, String password){
        mentor.setName(name);
        mentor.setSurname(surname);
        mentor.setEmail(email);
        mentor.setPhone(phone);
        mentor.setPassword(password);
    }

//    private void assignClassroom(Classroom classroom, Mentor mentor){
//        classroom.addMentor(mentor);
//    }

    private Level createLevelOfExperience(String name, int experience){
        Level level = new Level(name, experience);
        return level;
    }

    private void editLevelOfExperience(Level level, String name, int experience){
        level.setName(name);
        level.setExperience(experience);
    }
}
