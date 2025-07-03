import java.util.ArrayList;
import java.util.Scanner;


public class Show {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> infoList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            String line = sc.nextLine();
            infoList.add(line);
        }

        for (String info : infoList) {
            System.out.println(info);
        }
    }
}