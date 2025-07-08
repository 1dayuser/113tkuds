import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        char grade;
        if (S >= 90 && S <= 100) {
            grade = 'A';
        } else if (S >= 80) {
            grade = 'B';
        } else if (S >= 70) {
            grade = 'C';
        } else if (S >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);
    }
}

