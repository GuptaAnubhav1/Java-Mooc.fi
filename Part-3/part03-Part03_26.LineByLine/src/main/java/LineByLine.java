
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        String S ,S1;
        while((S = br.readLine()) != null && (S1 = br.readLine()) != null){
            String text[]= S.split(" ");
            String text2[] = S1.split(" ");
            for (String text1 : text) {
                System.out.println(text1);
            }
            for (String text3 : text2) {
                System.out.println(text3);
            }
        }

    }
}
