import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Registration
        Registration registration = new Registration();
        registration.Register();

        //test

        //login attempt
        Scanner s = new Scanner(System.in);

        System.out.println("Please login in: ");
        System.out.println("Enter Username: ");
        String loginUser = s.nextLine();

        System.out.println("Enter Password: ");
        String loginPass = s.nextLine();

        //Creates a login object
        Login login = new Login(
                registration.userName,
                registration.passWord,
                registration.firstName,
                registration.lastName);

        System.out.println(login.loginUser(loginUser, loginPass));
    }
}