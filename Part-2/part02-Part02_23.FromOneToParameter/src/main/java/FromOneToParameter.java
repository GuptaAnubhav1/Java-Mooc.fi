
import java.util.Scanner;
public class FromOneToParameter{
    public static void printUntilNumber(int n1) {
        
        int i =1;
        while(i < n1+1){
            System.out.println(i);
            i++;
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        printUntilNumber(x);
        
    }
}

