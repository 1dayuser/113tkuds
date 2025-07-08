import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.printf("%.2f\n", area);
    }
}

