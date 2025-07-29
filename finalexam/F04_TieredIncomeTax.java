package finalexam;

import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long[] incomes = new long[n];
            long[] taxes = new long[n];
            long totalTax = 0;

            for (int i = 0; i < n; i++) {
                incomes[i] = sc.nextLong();
                taxes[i] = computeTax(incomes[i]);
                totalTax += taxes[i];
            }

            for (long tax : taxes) {
                System.out.println("Tax: $" + tax);
            }

            long avg = totalTax / n;
            System.out.println("Average: $" + avg);
        }
    }

    static long computeTax(long income) {
        long tax = 0;

        long[] limits = { 0, 560000, 1260000, 2520000, 4720000 };
        long[] rates = { 5, 12, 20, 30, 40 };

        long[] brackets = { 560000, 700000, 1260000, 2200000 };

        if (income <= limits[1]) {
            return income * rates[0] / 100;
        }

        tax += brackets[0] * rates[0] / 100;
        income -= brackets[0];

        if (income <= brackets[1]) {
            return tax + income * rates[1] / 100;
        }

        tax += brackets[1] * rates[1] / 100;
        income -= brackets[1];

        if (income <= brackets[2]) {
            return tax + income * rates[2] / 100;
        }

        tax += brackets[2] * rates[2] / 100;
        income -= brackets[2];

        if (income <= brackets[3]) {
            return tax + income * rates[3] / 100;
        }

        tax += brackets[3] * rates[3] / 100;
        income -= brackets[3];

        return tax + income * rates[4] / 100;
    }
}

/*
 * 輸入
 * 3
 * 500000
 * 1500000
 * 6000000
 * 
 * 輸出
 * Tax: $25000
 * Tax: $122000
 * Tax: $1356000
 * Average: $498000
 * 
 */
