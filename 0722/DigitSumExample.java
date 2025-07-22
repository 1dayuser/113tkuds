import java.util.Scanner;

public class DigitSumExample {

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個正整數：");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("請輸入正整數！");
        } else {
            System.out.println("各位數字總和為：" + digitSum(number));
        }

        scanner.close();
    }
}
