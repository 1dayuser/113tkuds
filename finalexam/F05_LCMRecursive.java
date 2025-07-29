package finalexam;

import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = gcdRecursive(Math.abs(a), Math.abs(b));
            long lcm = (long) a * b / gcd;

            System.out.println("LCM: " + lcm);
        }
    }

    static int gcdRecursive(int a, int b) {
        if (a == b)
            return a;
        if (a > b)
            return gcdRecursive(a - b, b);
        else
            return gcdRecursive(a, b - a);
    }
}

/*
 * 輸入
 * 12 18
 * 
 * 輸出
 * LCM: 36
 * 
 */
