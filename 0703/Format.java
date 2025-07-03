import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        double num = sc.nextDouble();          
        System.out.printf("%.2f\n", num);
    }
}
}