
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        divisibleByThreeInRange(a,b);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i=beginning; i<end+1; i++){
            if(i%3==0){
                System.out.println(i);
            }
            
        }
        
        
        
    }

    

}
