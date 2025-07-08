import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.print(num);
                if (num != N && num != lastPrime(num, N)) {
                    System.out.print(" ");
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static int lastPrime(int start, int end) {
        for (int i = end; i >= start; i--) {
            if (isPrime(i)) return i;
        }
        return -1;
    }
}
