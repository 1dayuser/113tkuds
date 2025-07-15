import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            String time = sc.nextLine();
            timeStrs[i] = time;
            times[i] = toMinutes(time);
        }

        String query = sc.nextLine();
        int queryMin = toMinutes(query);

        int left = 0, right = n - 1;
        int resultIdx = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > queryMin) {
                resultIdx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (resultIdx == -1) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[resultIdx]);
        }

        sc.close();
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }
}
