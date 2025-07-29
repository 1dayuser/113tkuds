package finalexam;

import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            int[] times = new int[n];
            for (int i = 0; i < n; i++) {
                String[] parts = sc.nextLine().split(":");
                int hh = Integer.parseInt(parts[0]);
                int mm = Integer.parseInt(parts[1]);
                times[i] = hh * 60 + mm;
            }

            String[] queryParts = sc.nextLine().split(":");
            int queryTime = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

            int left = 0, right = n - 1;
            int answerIdx = -1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (times[mid] > queryTime) {
                    answerIdx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (answerIdx == -1) {
                System.out.println("No bike");
            } else {
                int hh = times[answerIdx] / 60;
                int mm = times[answerIdx] % 60;
                System.out.printf("%02d:%02d\n", hh, mm);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

/*
 * 輸入
 * 5
 * 08:30
 * 10:00
 * 12:15
 * 14:45
 * 17:30
 * 13:00
 * 
 * 輸出
 * 14:45
 */
