import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); 
        int result = (C * 9 / 5) + 32;
        System.out.println( result);
    }
}
