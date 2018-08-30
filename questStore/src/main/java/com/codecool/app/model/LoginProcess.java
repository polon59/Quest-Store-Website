// package com.codecool.app.model;

import java.util.Map;
import java.util.Scanner;//test

public class LoginProcess {

    private UserDAO userDAO;
    private Map<String, String> loginPasswordMap;
    private boolean isManager = false;
    private boolean isMentor = false;
    private boolean isStudent = false;

    Scanner scanner = new Scanner(System.in);

    public LoginProcess(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void loginToSystem(){
        String email = getUserEmail();
        String password = getUserPassword();
        loginPasswordMap = userDAO.getUsersLogData();
        System.out.println(loginPasswordMap.toString());

        if(isLoginCorrect(email)){
            isPasswordCorrect(email, password, loginPasswordMap);
                checkPrivileges(email);}
            else loginError();
    }

    private void checkPrivileges(String email) {
        int systemUserID = userDAO.getIdByEmail(email);
        User user = userDAO.findUserById(systemUserID);
        System.out.println(user.getName());
        System.out.println(user.getClass().getSimpleName());
        if(user.getClass().getSimpleName().equals("Manager")) loginAsManager();
        else if(user.getClass().getSimpleName().equals("Mentor")) loginAsMentor();
        else if(user.getClass().getSimpleName().equals("Student")) loginAsStudent();
        else databaseError();

    }



    private void redirectUser(){
        if(isManager) loginAsManager();
        if(isMentor) loginAsMentor();
        if(isStudent) loginAsStudent();
        if(!isManager && !isMentor && !isStudent) loginError();
    }

    public String getUserEmail(){
        System.out.print("Provide email:");//test
        String userEmail = scanner.nextLine();
        return userEmail;
    }

    public String getUserPassword(){
        System.out.print("Provide password");//test
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
//
//    private void isUserManager(int systemUserID){
//        if(systemUserID ==){
//            isManager = true;
//            redirectUser();}
//    }
//
//    private void isUserMentor(int systemUserID){
//        if(systemUserID ==){
//            isMentor = true;
//            redirectUser();}
//    }
//
//    private void isUserStudent(int systemUserID){
//        if(systemUserID ==){
//            isStudent = true;
//            redirectUser();}
//    }

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
