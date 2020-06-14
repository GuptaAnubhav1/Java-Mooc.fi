
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int b = Integer.valueOf(scanner.nextLine());
        int sum = 0;        
        for(int i =a; i<b+1; i++){
            sum +=i;
        }
        System.out.println("The sum is: "+ sum);
    }
}

