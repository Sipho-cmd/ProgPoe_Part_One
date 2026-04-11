import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Register the user
        Registration registration = new Registration();
        registration.Register();

        // creates the login object
        // Stores the registered user date for comparison
        Login login = new Login(
                registration.userName,
                registration.passWord,
                registration.firstName,
                registration.lastName);

        Scanner s = new Scanner(System.in);

        // Username login loop
        // It will keep asking until the username is entered
        while (true) {
            System.out.println("Please login in: ");

            System.out.println("Enter Username: ");
            String loginUser = s.nextLine();

            if (loginUser.equals(registration.userName)) {
                System.out.println("Username correct");
                break;
            } else {
                System.out.println("Username incorrect. Try again...");
            }
        }

        // Password login loop
        // It will keep asking until the password is entered
        while (true) {
            System.out.println("Enter Password: ");
            String loginPass = s.nextLine();

            if (loginPass.equals(registration.passWord)) {
                System.out.println("Password correct");
                break;
            } else {
                System.out.println("Password incorrect. Try again...");
            }
        }

        // The success message
        System.out.println("Welcome "
        + registration.firstName + " "
        + registration.lastName
        + " It is great to see you againn");

        s.close();
    }
}