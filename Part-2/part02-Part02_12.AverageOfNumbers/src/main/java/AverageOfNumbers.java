
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float avg =0;
        float sum = 0;
        float count =0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num==0){
                System.out.println("Average of the numbers: "+ avg);
                break;
            }else{
                sum = sum + num;
                count++;
                avg = (sum/count);
                continue;
            }
        }

    }
}
