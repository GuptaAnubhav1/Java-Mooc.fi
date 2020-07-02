
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        String users[] = new String[2];
        users[0] = "alex";
        users[1] = "emma";
        String password[] = new String[2];
        password[0] = "sunshine";
        password[1] = "haskell";
        if((user.equals(users[0])&&pass.equals(password[0]))||(user.equals(users[1])&&pass.equals(password[1]))){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
        

    }
}
