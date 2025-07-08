import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        System.out.println(sum);
    }
}

