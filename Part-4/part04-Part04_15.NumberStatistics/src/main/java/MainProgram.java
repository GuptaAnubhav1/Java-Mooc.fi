
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();       
        System.out.println("Enter numbers: ");
        while(true){
            int x = Integer.valueOf(scanner.nextLine());
            if(x==-1){
                break;
            }
            statistics.addNumber(x);
            if(x%2==0){
                statisticsEven.addNumber(x);
            }else{
                statisticsOdd.addNumber(x);
            }
        }
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of even numbers: "+ statisticsEven.sum());
        System.out.println("Sum of odd numbers: "+ statisticsOdd.sum());
    }
}
