
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i =0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i =0; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1; i<=size;i++){
            for(int j=(size-i); j>0;j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public static void christmasTree(int height) {
        for(int i=1; i<=height;i++){
            for(int j=i; j<(height);j++){
                System.out.print(" ");
            }
            for(int k=1; k<i*2; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i =1; i<=2; i++){
            System.out.print(" ");
            for(int j=height-3;j>0;j--){
                System.out.print(" ");                                       
            }
            for(int k= 3;k>0;k--){
                System.out.print("*");        
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printStars(2);
        System.out.println("---");
        printSpaces(4);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
    }
}
