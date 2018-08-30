package com.codecool.app.controler;

import com.codecool.app.model.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
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

        String response = "";
        String method = httpExchange.getRequestMethod();

        if (method.equals("GET")) {
            String path = getPath(httpExchange);
            System.out.println(path);
            c.getFileFromResources(httpExchange, path);
        }

//        System.out.println(httpExchange.getRequestMethod());
//        System.out.println(httpExchange.getRequestURI());
//

        String URI = httpExchange.getRequestURI().toString();
        System.out.println("URI ::" + URI);
        this.uri = Common.parseUri(URI);

        if (method.equals("POST")) {
            System.out.println("\n\n AdD NEW CLASS \n\n");

            addNewClass(httpExchange);
            Common.redirect(httpExchange, "/manager/indexManager.html");
        }

        Common.sendResponse(httpExchange, response);

    }

    private String getPath(HttpExchange httpExchange) {
        System.out.println("URI" + httpExchange.getRequestURI().toString());
        this.uri = Common.parseUri(httpExchange.getRequestURI().toString());
        String path = ".";
        for (int i = thirdOnList; i < uri.length; i++) {
            path += "/";
            path += uri[i];
        }
        return path;
    }


    private void addNewClass(HttpExchange httpExchange) throws UnsupportedEncodingException, IOException {
        System.out.println("Inside addClass method");

        Map<String, String> data = formatData(httpExchange);
        String className = data.get("classInput").toString();
        System.out.println("Class name" + className);
        classroomDAO.insertNewClassroom(className);
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

    private Map<String, String> formatData(HttpExchange httpExchange) throws UnsupportedEncodingException, IOException {
        InputStreamReader isr = new InputStreamReader(httpExchange.getRequestBody(), "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String formData = br.readLine();

        System.out.println(formData);

        return parseFormData(formData);
    }

    private Map<String, String> parseFormData(String formData) throws UnsupportedEncodingException {
        Map<String, String> map = new HashMap<String, String>();
        String[] pairs = formData.split("&");
        for(String pair : pairs){
            String[] keyValue = pair.split("=");

            String value = new URLDecoder().decode(keyValue[1], "UTF-8");
            map.put(keyValue[0], value);
        }
        return map;
    }
}
