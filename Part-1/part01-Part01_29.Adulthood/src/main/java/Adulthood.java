
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.valueOf(scan.nextLine());
        System.out.println("How old are you?");
        if(num >= 18){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are not an adult");
        }
    }
}
