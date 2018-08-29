import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMain {

    UserDAO userDAO;
    ManagerDAO managerDAO;
    MentorDAO mentorDAO;


    public static void main(String[] args) {
        
        TestMain test = new TestMain();
        test.testAllDAO();

    }

    private void testAllDAO(){
        FactoryDAO factoryDAO = new FactoryDAO();

        userDAO = factoryDAO.getUserDAO();
        managerDAO = factoryDAO.getManagerDAO();
        mentorDAO = factoryDAO.getMentorDAO();

        testManagerDAO();
        testUserDAO();
        testMentorDAO();
    }

    private void testUserDAO(){
        System.out.println("==========================");
        // test email set
        userDAO.setEmail("new email", 3);
        System.out.println("\n");

        // test phone set
        userDAO.setPhone("new phone", 2);
        System.out.println("\n");

        //test finding user by email
        System.out.println("test finding user by email:");
        System.out.println(userDAO.findUserByEmail("jm@o2.pl").toString());
        System.out.println("\n");        

        //test finding user by id
        System.out.println("test finding user by id:");
        User foundUser =  userDAO.findUserById(7);
        System.out.println(foundUser.toString()); 
        System.out.println("\n");
        
        //test finding user's name
        System.out.println("test finding user's name:");
        String name = userDAO.getName(7);
        System.out.println(name);
        System.out.println("\n");

        // test finding user's surname
        System.out.println("test finding user's surname");
        String surname = userDAO.getSurname(7);
        System.out.println(surname);
        System.out.println("\n");

        // test finding user's email
        System.out.println("test finding user's email");
        String email = userDAO.getEmail(7);
        System.out.println(email);
        System.out.println("\n");

        // test finding user's phone
        System.out.println("test finding user's phone");
        String phone = userDAO.getPhone(7);
        System.out.println(phone);
        System.out.println("\n");
    }

    private void testMentorDAO(){
        // test finding mentor by userID
        System.out.println("==========================");
        System.out.println("test finding mentor by userID");
        int mentorID = mentorDAO.getIdMentor(11);
        System.out.println(mentorID);
        System.out.println("\n");
    }

    private void testManagerDAO(){
        // test finding managerID by userID
        System.out.println("==========================");
        System.out.println("test finding managerID by userID");
        int managerID = managerDAO.getIdManager(5);
        System.out.println(managerID);
        System.out.println("\n");
    }

}