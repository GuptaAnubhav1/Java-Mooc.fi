
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yr = Integer.valueOf(scan.nextLine());
        System.out.println("Give a year:");
        if(yr<2015){
            System.out.println("Ancient history!");
        }
        
    }
}
