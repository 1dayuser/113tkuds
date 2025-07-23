import java.util.Scanner;

public class FactorialExampleInput {

    public static String factorialWithSteps(int n) {
        if (n < 0) {
            return "請輸入非負整數！";
        }

        if (n == 0 || n == 1) {
            return n + "! = 1";
        }

        int result = 1;
        StringBuilder steps = new StringBuilder();
        steps.append(n + "! = ");

        for (int i = 1; i <= n; i++) {
            result *= i;
            steps.append(i);
            if (i < n) {
                steps.append(" * ");
            }
        }

        steps.append(" = " + result);
        return steps.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個非負整數: ");
        int number = scanner.nextInt();

        String output = factorialWithSteps(number);
        System.out.println(output);

        scanner.close();
    }
}
