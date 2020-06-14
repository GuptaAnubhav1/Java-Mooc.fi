
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        float sum = 0;
        float count = 0;
        float average = 0;
        int even = 0;
        int odd = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx!Bye!");
                break;
            }else{
                sum +=num;
                count++;
                average = sum/count;
                if(num%2==0){
                    even +=1;
                }else{
                    odd +=1;
                }
                continue;               
            }            
        }
        int c = (int)count;
        int s = (int)sum;
        System.out.println("Sum: " +  s);
        System.out.println("Numbers: " + c);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
