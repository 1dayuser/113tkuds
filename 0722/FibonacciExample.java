import java.util.Scanner;

public class FibonacciExample {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要求的項數 n：");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("請輸入非負整數！");
        } else {
            System.out.println("費波納契數列第 " + n + " 項為：" + fibonacci(n));
        }

        scanner.close();
    }
}
