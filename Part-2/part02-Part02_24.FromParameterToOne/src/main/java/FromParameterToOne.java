
import java.util.Scanner;



public class FromParameterToOne {

    
    public static void printFromNumberToOne(int n1) {
        
        int i =n1;
        while(i > 0){
            System.out.println(i);
            i--;
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(x);
        
    }
}
