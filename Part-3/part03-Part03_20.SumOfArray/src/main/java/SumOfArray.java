import java.util.Scanner;
public class SumOfArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = Integer.valueOf(s.nextLine());
        int[] array = new int[size];
        //System.out.println("Enter Elements:");
        for(int j =0;j<size;j++){
            array[j] = s.nextInt();
        }
        
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int i, sum=0;
        for(i=0;i<array.length;i++){          
            sum += array[i];
        }
        return sum;
    }
}
