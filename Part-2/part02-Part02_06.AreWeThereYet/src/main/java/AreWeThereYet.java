
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a!=4){
                System.out.println("Give a number:");
            }else{
                break;
            }
        }

    }
}
