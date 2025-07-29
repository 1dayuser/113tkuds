package finalexam;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n < 1 || n > 131) {
                System.out.println("Invalid");
                return;
            }

            String[] stops = new String[n];
            for (int i = 0; i < n; i++) {
                stops[i] = sc.next();
            }

            String start = sc.next();
            String end = sc.next();

            int startIdx = -1, endIdx = -1;

            for (int i = 0; i < n; i++) {
                if (stops[i].equals(start)) {
                    startIdx = i;
                }
                if (stops[i].equals(end)) {
                    endIdx = i;
                }
            }

            if (startIdx == -1 || endIdx == -1) {
                System.out.println("Invalid");
            } else {
                System.out.println(Math.abs(endIdx - startIdx) + 1);
            }
        }
    }
}
/*
 * 輸入
 * 7
 * R02 R04 R05 R06 R07 R08 R10
 * R04 R08
 * 輸出
 * 5
 */