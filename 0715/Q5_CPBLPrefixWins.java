import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            results[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + results[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + prefixSum[i]);
        }
        System.out.println();

        sc.close();
    }
}
