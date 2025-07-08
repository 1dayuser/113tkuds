public class ArrayStatistics {

    public static void main(String[] args) {
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        double average;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int aboveAverageCount = 0;
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < data.length; i++) {
            int val = data[i];
            sum += val;

            if (val > max) {
                max = val;
                maxIndex = i;
            }

            if (val < min) {
                min = val;
                minIndex = i;
            }

            if (val % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        average = (double) sum / data.length;
        for (int val : data) {
            if (val > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("=陣列統計分析=");
        System.out.printf("%-20s: %d%n", "總和", sum);
        System.out.printf("%-20s: %.2f%n", "平均值", average);
        System.out.printf("%-20s: %d (索引: %d)%n", "最大值", max, maxIndex);
        System.out.printf("%-20s: %d (索引: %d)%n", "最小值", min, minIndex);
        System.out.printf("%-20s: %d%n", "大於平均值的數字個數", aboveAverageCount);
        System.out.printf("%-20s: %d%n", "偶數個數", evenCount);
        System.out.printf("%-20s: %d%n", "奇數個數", oddCount);
        System.out.println("==============");
    }
}
