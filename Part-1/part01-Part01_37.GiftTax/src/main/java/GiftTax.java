
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0;
        if ((5000<= value)&& (value< 25000) ){
            tax = (100 + (value- 5000)*0.08);
            System.out.println("Tax: "+ tax);
        } else if(((25000<= value)&& (value< 55000) )){
            tax = (1700 + (value- 25000)*0.10);
            System.out.println("Tax: "+ tax);
        }else if(((55000<= value)&& (value< 200000) )){
            tax = (4700 + (value- 55000)*0.12);
            System.out.println("Tax: "+ tax);
        }else if(((200000<= value)&& (value< 1000000) )){
            tax = (22100 + (value- 200000)*0.15);
            System.out.println("Tax: "+ tax);
        }else if(1000000<= value ){
            tax = (142100 + (value- 1000000)*0.17);
            System.out.println("Tax: "+ tax);
        }else{
            System.out.println("No tax!");
        }

    }
}
