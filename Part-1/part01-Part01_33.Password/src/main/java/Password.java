
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Password?");
        String str = String.valueOf(scan.nextLine());
        String str2 = "Caput Draconis";
        if (str.equals(str2)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
