
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        division(a,b);
    }

    public static void division(int numerator, int denominator){
        float answer = (float)numerator/denominator;
        System.out.println(answer);
        
    }
    

    
}
