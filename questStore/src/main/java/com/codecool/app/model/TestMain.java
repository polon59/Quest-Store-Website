import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMain {

    UserDAO userDAO;
    ManagerDAO managerDAO;


    public static void main(String[] args) {
        
        TestMain test = new TestMain();
        test.testAllDAO();

    }

    private void testAllDAO(){
        FactoryDAO factoryDAO = new FactoryDAO();

        userDAO = factoryDAO.getUserDAO();
        managerDAO = factoryDAO.getManagerDAO();
    }

    private void testUserDAO(){

        // test email set
        userDAO.setEmail("new email", 3);

        // test phone set
        userDAO.setPhone("new phone", 2);

        //test finding user by email
        System.out.println("test finding user by email:");
        System.out.println(userDAO.findUserByEmail("ff").toString());


        //test finding user by id
        System.out.println("test finding user by id:");
        User foundUser =  userDAO.findUserById(3);
        System.out.println(foundUser.toString()); 
        

        //test finding user's name
        System.out.println("test finding user's name:");
        String name = userDAO.getName(3);
        System.out.println(name);

        // test finding user's surname
        System.out.println("test finding user's surname");
        String surname = userDAO.getSurname(3);
        System.out.println(surname);

        // test finding user's email
        System.out.println("test finding user's email");
        String email = userDAO.getEmail(3);
        System.out.println(email);

        // test finding user's phone
        System.out.println("test finding user's phone");
        String phone = userDAO.getPhone(3);
        System.out.println(phone);
    }

    private void testMentorDAO(){

    }

    private void testManagerDAO(){
        
    }

}