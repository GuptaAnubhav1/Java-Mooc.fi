
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float avg =0;
        float sum = 0;
        float count =0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num>0){
                sum = sum + num;
                count++;
                avg = (sum/count);
                continue;
            }else if (num<0){
                continue;
            }else {    
                if(count==0){
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(avg);
                }
                break;
            }
        }

    }
}
