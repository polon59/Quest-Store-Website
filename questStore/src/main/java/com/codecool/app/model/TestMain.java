import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

    UserDAO userDAO;
    ManagerDAO managerDAO;
    MentorDAO mentorDAO;
    ClassroomDAO classroomDAO;
    GroupDAO groupDAO;


    public static void main(String[] args) {
        
        TestMain test = new TestMain();
        test.testAllDAO();

    }

    private void testAllDAO(){
        FactoryDAO factoryDAO = new FactoryDAO();

        userDAO = factoryDAO.getUserDAO();
        managerDAO = factoryDAO.getManagerDAO();
        mentorDAO = factoryDAO.getMentorDAO();
        classroomDAO = factoryDAO.getClassroomDAO();
        groupDAO = factoryDAO.getGroupDAO();

        // testManagerDAO();
        // testUserDAO();
        // testMentorDAO();
        // testClassroomDAO();
        testGroupDAO();
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

        // test setting mentor classroom
        System.out.println("test setting mentor classroom");
        List<Integer> idsClassroom = new ArrayList<>();
        idsClassroom.add(1);
        idsClassroom.add(2);
        idsClassroom.add(3);
        int idMentor = 2;
        mentorDAO.setMentorClassroom(idsClassroom, idMentor);
        System.out.println("mentor classes set successfully");
        System.out.println("\n");

        // test finding mentor classes by mentorID
        System.out.println("test finding mentor classes by mentorID");
        List<Classroom> classroomList = mentorDAO.getMentorClassrooms(2);
        for (Classroom classroom : classroomList) {
            System.out.println(classroom.toString());
        }
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


    private void testClassroomDAO(){
        // test finding classroom id by classroom name
        System.out.println("==========================");
        System.out.println("test finding classroom id by classroom name");
        int classroomId;
        String classroomName = "web room";
        classroomId = classroomDAO.getIdClassroom(classroomName);
        System.out.println(classroomId);
        System.out.println("\n");


         // test finding classroom name by classroom id
         System.out.println("test finding classroom name by classroom id");
         int id = 2;
         String name;
         name = classroomDAO.getName(id);
         System.out.println(name);
         System.out.println("\n");


         // test finding all classrooms
         System.out.println("test finding all classrooms");
         List<Classroom> classrooms = new ArrayList<>();
         classrooms = classroomDAO.getListOfAll();
         for (Classroom classroom : classrooms) {
             System.out.println(classroom.toString());
         }
         System.out.println("\n");


         // test finding classroom by name
         System.out.println("test finding classroom by name");
         System.out.println(classroomDAO.findClassroom("python basic").toString());
         System.out.println("\n");


         // test finding classroom by id
         System.out.println("test finding classroom by name");
         System.out.println(classroomDAO.findClassroom(1).toString());
         System.out.println("\n");

        // test insert new classroom
        Classroom classToAdd = new Classroom("new classroom", 44);
        System.out.println("OLD ID = "+ classToAdd.getIDClassroom());
        classroomDAO.insertNewClassroom(classToAdd);
        System.out.println("NEW ID = "+ classToAdd.getIDClassroom());

    }


    public void testGroupDAO(){
        // test finding group id by group name
        System.out.println("==========================");
        System.out.println("test finding group id by group name");
        String name = "group1";
        int groupId = groupDAO.getIdGroup(name);
        System.out.println(groupId);
        System.out.println("\n");
    }
}