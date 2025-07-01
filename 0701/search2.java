import java.util.Scanner;

public class search2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 假設數列已排序
        int[] S = {3, 8, 15, 23, 42, 55};

        System.out.print("輸入要找的數: ");
        int x = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < S.length; i++) {
            System.out.println("比較 " + S[i] + " 和 " + x);
            if (S[i] == x) {
                found = true;
                System.out.println("找到數字 " + x + "，位置在索引 " + i);
                break;
            } else if (S[i] > x) {
                System.out.println("目前數字 " + S[i] + " 已經比 " + x + " 大，停止搜尋。");
                break;
            }
        }

        if (!found) {
            System.out.println("找不到數字 " + x + "。");
        }

        scanner.close();
    }
}

    