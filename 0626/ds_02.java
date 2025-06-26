
import java.util.Scanner;

public class ds_02 {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.print("輸入半徑");
            double a = scanner.nextDouble();

            double area = Math.PI*a*a;

            System.err.println("面積"+area);
        }
    }
}
