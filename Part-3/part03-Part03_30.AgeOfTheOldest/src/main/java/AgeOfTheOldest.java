
import java.util.Arrays;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =0;
        int oldest = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String numbers[] = input.split(",");
            max = Integer.valueOf(numbers[1]);   
            if(max>oldest){
                oldest=max;
            }
         
        }
        System.out.println("Age of the oldest: "+oldest);

    }
}
