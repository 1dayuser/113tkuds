package finalexam;

import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            String[] names = new String[n];
            int[] qtys = new int[n];

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                int spaceIdx = line.lastIndexOf(' ');
                names[i] = line.substring(0, spaceIdx);
                qtys[i] = Integer.parseInt(line.substring(spaceIdx + 1));
            }

            for (int i = 1; i < n; i++) {
                int keyQty = qtys[i];
                String keyName = names[i];
                int j = i - 1;

                while (j >= 0 && qtys[j] < keyQty) {
                    qtys[j + 1] = qtys[j];
                    names[j + 1] = names[j];
                    j--;
                }

                qtys[j + 1] = keyQty;
                names[j + 1] = keyName;
            }

            int outputCount = Math.min(10, n);
            for (int i = 0; i < outputCount; i++) {
                System.out.println(names[i] + " " + qtys[i]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

/*
 * 輸入
 * 5
 * 便當 120
 * 茶葉蛋 450
 * 關東煮 180
 * 咖啡 600
 * 御飯糰 220
 * 
 * 輸出
 * 5
 * 便當 120
 * 茶葉蛋 450
 * 關東煮 180
 * 咖啡 600
 * 御飯糰 220
 * 咖啡 600
 * 茶葉蛋 450
 * 御飯糰 220
 * 關東煮 180
 * 便當 120
 */
