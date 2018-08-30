// package com.codecool.app.model;

import java.util.Map;
import java.util.Scanner;//test

public class LoginProcess {

    private Map<String, String> loginPasswordMap;
    private FactoryDAO factoryDAO;
    private MentorDAO mentorDAO;
    private StudentDAO studentDAO;
    private ManagerDAO managerDAO;
    private UserDAO userDAO;

    Scanner scanner = new Scanner(System.in);

    public LoginProcess(FactoryDAO factoryDAO){
        this.factoryDAO = factoryDAO;
        mentorDAO = factoryDAO.getMentorDAO();
        studentDAO = factoryDAO.getStudentDAO();
        managerDAO = factoryDAO.getManagerDAO();
        userDAO = factoryDAO.getUserDAO();
        
    }

    public void loginToSystem(){
        String email = getUserEmail();
        String password = getUserPassword();
        loginPasswordMap = userDAO.getUsersLogData();
        System.out.println(loginPasswordMap.toString());

        if(isLoginCorrect(email)){
            if(isPasswordCorrect(email, password, loginPasswordMap))
                checkPrivileges(email);
            else loginError();}
            else loginError();
    }

    private String checkUserCategory(int systemUserID){
        String foundUserType = "";

        foundUserType = managerDAO.checkIfIdInTable(systemUserID);

        if (foundUserType.equals("")) {
            foundUserType = mentorDAO.checkIfIdInTable(systemUserID);

            if (foundUserType.equals("")) {
                foundUserType = studentDAO.checkIfIdInTable(systemUserID);
            }
        }

        return foundUserType;
    }

    private void checkPrivileges(String email) {
        int systemUserID = userDAO.getIdByEmail(email);
        User user = userDAO.findUserById(systemUserID);
        System.out.println(user.getName());
        System.out.println(user.getClass().getSimpleName());

        String foundUserType = checkUserCategory(systemUserID);

        
        if (foundUserType=="manager") {
            loginAsManager();
        }
        else if (foundUserType=="mentor") {
            loginAsMentor();
        }
        else if (foundUserType=="student") {
            loginAsStudent();
        }
        else{
            databaseError();
        }

    }

    // private void redirectUser(){
    //     if(isManager) loginAsManager();
    //     if(isMentor) loginAsMentor();
    //     if(isStudent) loginAsStudent();
    //     if(!isManager && !isMentor && !isStudent) loginError();
    // }

    public String getUserEmail(){
        System.out.print("Provide email: ");//test
        String userEmail = scanner.nextLine();
        return userEmail;
    }

    public String getUserPassword(){
        System.out.print("Provide password: ");//test
        String userPassword = scanner.nextLine();
        return userPassword;
    }

    private boolean isLoginCorrect(String userEmail){
        if(loginPasswordMap.containsKey(userEmail)) return true;
        else return false;
    }

    private boolean isPasswordCorrect(String userEmail, String userPassword, Map<String, String> loginPasswordMap){
            String correctPassword = loginPasswordMap.get(userEmail);
            if(correctPassword.equals(userPassword)) return true;
            else return false;


    }

    private void loginAsManager(){
        System.out.println("ZALOGOWANO MANAGERA");
    }

    private void loginAsMentor(){
        System.out.println("ZALOGOWANO MENTORA");
    }

    private void loginAsStudent(){
        System.out.println("ZALOGOWANO STUDENTA");

    }

    private String loginError(){
        String loginError = "Invalid login or password";
        System.out.println(loginError);
        return loginError;
    }

    private String databaseError(){
        String dbError = "Could not find user";
        System.out.println(dbError);
        return dbError;
    }


}
