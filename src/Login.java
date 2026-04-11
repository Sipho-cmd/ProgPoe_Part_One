public class Login {

    String userName;
    String password;
    String firstName;
    String lastName;

    // Constructor stores the users details
    public Login(String userName, String password, String firstName, String lastName){
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Checks if the login details match the registered details
    // Returns true if correct, false if incorrect
    public boolean loginUser(String Username, String Password){
        return Username.equals(this.userName) && Password.equals(this.password);
    }
}