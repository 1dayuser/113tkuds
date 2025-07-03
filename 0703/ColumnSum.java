import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int[] columnSums = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int value = sc.nextInt();
                columnSums[j] += value; 
            }
        }

        for (int j = 0; j < M; j++) {
            System.out.print(columnSums[j]);
            if (j != M - 1) {
                System.out.print(" ");
            }
        }
    }
}
