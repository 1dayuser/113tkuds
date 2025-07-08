import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
