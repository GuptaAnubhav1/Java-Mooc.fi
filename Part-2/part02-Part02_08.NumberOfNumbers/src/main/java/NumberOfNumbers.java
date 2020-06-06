
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.print("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a==0){
                System.out.println("Number of numbers: " + num);
                break;
            }else{
                num++;
                continue;
            }
        }

    }
}
