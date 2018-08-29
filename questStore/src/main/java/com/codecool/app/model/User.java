

public class User {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    // private UserDAO userDao;

    public User(int id, String name, String surname, String email, String phone){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        // this.userDao = userDao;
    }

    public int getUserID(){
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

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String toString(){
        return id + " " + name + " " + surname + " " + email + " " + phone + "\n";
    }

}
