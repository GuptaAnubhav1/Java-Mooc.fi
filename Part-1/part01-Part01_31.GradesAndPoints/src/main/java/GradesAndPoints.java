
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:" );
        int num1 = Integer.valueOf(scan.nextLine());
        if(num1 <0){
            System.out.println("Grade: impossible!");
        }else if(num1 >= 0 && num1<50){
            System.out.println("Grade: failed");
        }else if(num1 >= 50 && num1 < 60){
            System.out.println("Grade: 1");
        }else if(num1 >= 60 && num1 < 70){
            System.out.println("Grade: 2");
        }else if(num1 >= 70 && num1 < 80){
            System.out.println("Grade: 3");
        }else if(num1 >= 80 && num1<90){
            System.out.println("Grade: 4");
        }else if(num1 >= 90 && num1<= 100){
            System.out.println("Grade: 5");
        }else {
            System.out.println("Grade: incredible!");
        }
    }
}
