import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Registration
        Registration registration = new Registration();
        registration.Register();

        // Login object
        Login login = new Login(
                registration.userName,
                registration.passWord,
                registration.firstName,
                registration.lastName);

        Scanner s = new Scanner(System.in);

        boolean success = false;

        while (!success) {
            System.out.println("Please login in: ");

            System.out.println("Enter Username: ");
            String loginUser = s.nextLine();

            System.out.println("Enter Password: ");
            String loginPass = s.nextLine();

            String result = login.loginUser(loginUser, loginPass);
            System.out.println(result);

            // Check if login is successful
            if (!result.equals("Login successful")) {
                success = true;
            } else {
                System.out.println("Try again...");
            }
        }

        s.close();
    }
}