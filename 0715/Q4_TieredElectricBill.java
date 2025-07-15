import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            int bill = calc(kWh);
            System.out.println("Bill: $" + bill);
            total += bill;
        }

        int average = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + average);

        sc.close();
    }

    public static int calc(int kWh) {
        double sum = 0;

        if (kWh > 1000) {
            sum += (kWh - 1000) * 8.46;
            kWh = 1000;
        }
        if (kWh > 700) {
            sum += (kWh - 700) * 6.24;
            kWh = 700;
        }
        if (kWh > 500) {
            sum += (kWh - 500) * 5.04;
            kWh = 500;
        }
        if (kWh > 330) {
            sum += (kWh - 330) * 3.70;
            kWh = 330;
        }
        if (kWh > 120) {
            sum += (kWh - 120) * 2.45;
            kWh = 120;
        }
        sum += kWh * 1.68;

        return (int) Math.round(sum);
    }
}