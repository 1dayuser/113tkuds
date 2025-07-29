package finalexam;

import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Pair result = findSecondMax(arr, 0, n - 1);
            System.out.println("SecondMax: " + result.second);
        }
    }

    static class Pair {
        int max;
        int second;

        Pair(int max, int second) {
            this.max = max;
            this.second = second;
        }
    }

    static Pair findSecondMax(int[] arr, int left, int right) {
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE);
        }

        int mid = (left + right) / 2;
        Pair p1 = findSecondMax(arr, left, mid);
        Pair p2 = findSecondMax(arr, mid + 1, right);

        int max, second;

        if (p1.max > p2.max) {
            max = p1.max;
            second = Math.max(p1.second, p2.max);
        } else {
            max = p2.max;
            second = Math.max(p2.second, p1.max);
        }

        return new Pair(max, second);
    }
}

/*
 * 輸入
 * 7
 * 5 9 3 7 1 8 4
 * 
 * 輸出
 * SecondMax: 8
 */
