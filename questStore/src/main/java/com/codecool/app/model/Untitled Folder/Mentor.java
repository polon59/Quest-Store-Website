
import java.util.List;
import java.util.ArrayList;

public class Mentor extends User {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    //private List<Classroom> classrooms;
    
    public Mentor(int id, String name, String surname, String email, String phone, String password){
        super(id, name, surname, email, phone,password);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String getPassword(){
        return password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password) { this.password = password; }



}