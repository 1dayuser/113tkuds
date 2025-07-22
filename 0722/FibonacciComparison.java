import java.util.Scanner;

public class FibonacciComparison {

    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }

    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 n 值: ");
        int n = scanner.nextInt();

        long startTime, endTime;

        startTime = System.nanoTime();
        int resultSlow = fibonacciSlow(n);
        endTime = System.nanoTime();
        System.out.println("fibonacciSlow(" + n + ") = " + resultSlow);
        System.out.println("耗時: " + (endTime - startTime) / 1_000_000.0 + " 毫秒");

        int[] memo = new int[n + 1]; 
        startTime = System.nanoTime();
        int resultFast = fibonacciFast(n, memo);
        endTime = System.nanoTime();
        System.out.println("fibonacciFast(" + n + ") = " + resultFast);
        System.out.println("耗時: " + (endTime - startTime) / 1_000_000.0 + " 毫秒");
    }
}
