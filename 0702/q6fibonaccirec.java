import java.util.Scanner;
public class q6fibonaccirec {
    static int ops=0;
    public static int fib(int n){
        ops++;
        if(n<=1){
            return n;
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取 n
        int n = sc.nextInt();

        // 計算 Fibonacci(n)
        int result = fib(n);

        // 輸出結果與操作次數
        System.out.println(result);
        System.out.println(ops);

        sc.close();
    }
}