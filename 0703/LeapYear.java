import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        boolean isLeap = false;

        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
            isLeap = true;
        }

        System.out.println(isLeap ? "Yes" : "No");
    }
}

