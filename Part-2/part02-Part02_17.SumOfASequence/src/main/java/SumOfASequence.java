
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int a = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        if(a==1){
            System.out.println("The sum is "+ a);
        } else{
            for(int i =1; i<a+1; i++){
                sum +=i;
            }
            System.out.println("The sum is "+ sum);
        }
    }

}

