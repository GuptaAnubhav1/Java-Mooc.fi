
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int a = Integer.valueOf(scanner.nextLine());
        int factorial = 1;        
        
        for(int i =1; i<a+1; i++){
            factorial *=i;
        }
        System.out.println("Factorial: "+ factorial);
    }    
}
