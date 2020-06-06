
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carry on?");
        while(true){
            String s = scanner.nextLine();
            String s2 = "no";
            if (!s.equals(s2)){               
                System.out.println("Carry on?");
            }else{
                break;
            }
        }

    }
}
