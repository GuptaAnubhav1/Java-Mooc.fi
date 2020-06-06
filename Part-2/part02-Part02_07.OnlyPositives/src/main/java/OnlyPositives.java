
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a<0){
                System.out.print("Unsuitable number\n");
                continue;
            }
            if(a>0){
                System.out.print(a*a);
                continue;
            }
            if(a==0){
                break;
            }
        }

    }
}
