
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int add = (num1 + num2);
        int subtract = (num1 - num2);
        int multiply = (num1 * num2);
        double division = (double) num1/num2;
        System.out.println(num1 + " + "+ num2 + " = " + add);
        System.out.println(num1 + " - "+ num2 + " = " + subtract);
        System.out.println(num1 + " * "+ num2 + " = " + multiply);
        System.out.println(num1 + " / "+ num2 + " = " + division);

    }
}
