class InsertionSortDemo {
    static void insertionSort(int[] array) {
        int n = array.length;
        int totalComparisons = 0;
        int totalShifts = 0;
        long startTime = System.nanoTime();

        System.out.println("插入排序過程：");
        System.out.println("已排序部分 | 未排序部分");
        System.out.println("------------|------------");

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            double elapsed = (System.nanoTime() - startTime) / 1_000_000.0;
            System.out.printf("\n[%.3f ms] 第 %d 步：插入元素 %d\n", elapsed, i, key);

            System.out.print("插入前：");
            for (int k = 0; k < i; k++) System.out.print(array[k] + " ");
            System.out.print("| ");
            for (int k = i; k < n; k++) {
                if (k == i) System.out.print("[" + array[k] + "] ");
                else System.out.print(array[k] + " ");
            }
            System.out.println();

            while (j >= 0 && array[j] > key) {
                totalComparisons++;
                elapsed = (System.nanoTime() - startTime) / 1_000_000.0;
                System.out.printf("[%.3f ms] 比較 %d > %d，將 %d 向右移動\n",
                        elapsed, array[j], key, array[j]);
                array[j + 1] = array[j];
                totalShifts++;
                j--;
            }

            if (j >= 0) totalComparisons++;

            array[j + 1] = key;
            elapsed = (System.nanoTime() - startTime) / 1_000_000.0;
            System.out.printf("[%.3f ms] 將 %d 插入到位置 %d\n", elapsed, key, j + 1);

            System.out.print("插入後：");
            for (int k = 0; k <= i; k++) System.out.print(array[k] + " ");
            System.out.print("| ");
            for (int k = i + 1; k < n; k++) System.out.print(array[k] + " ");
            System.out.println();
        }

        double totalElapsed = (System.nanoTime() - startTime) / 1_000_000.0;
        System.out.printf("\n排序完成！總比較次數：%d，總移動次數：%d\n", totalComparisons, totalShifts);
        System.out.printf("總花費時間：%.3f 毫秒\n", totalElapsed);
    }

    static void binaryInsertionSort(int[] array) {
        long startTime = System.nanoTime();
        System.out.println("\n二分插入排序過程：");

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            double elapsed = (System.nanoTime() - startTime) / 1_000_000.0;

            int insertPos = binarySearchInsertPosition(array, 0, i - 1, key, startTime);
            System.out.printf("[%.3f ms] 將 %d 插入到位置 %d\n", elapsed, key, insertPos);

            for (int j = i; j > insertPos; j--) {
                array[j] = array[j - 1];
            }

            array[insertPos] = key;
            System.out.println("目前陣列：" + java.util.Arrays.toString(array));
        }

        double totalElapsed = (System.nanoTime() - startTime) / 1_000_000.0;
        System.out.printf("總花費時間：%.3f 毫秒\n", totalElapsed);
    }

    static int binarySearchInsertPosition(int[] array, int left, int right, int key, long startTime) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double elapsed = (System.nanoTime() - startTime) / 1_000_000.0;
            System.out.printf("[%.3f ms] 比較 %d 和 %d\n", elapsed, array[mid], key);

            if (array[mid] <= key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = numbers1.clone();

        System.out.println("原始陣列：" + java.util.Arrays.toString(numbers1));

        System.out.println("\n=== 基本插入排序 ===");
        insertionSort(numbers1);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers1));

        System.out.println("\n=== 二分插入排序 ===");
        binaryInsertionSort(numbers2);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers2));
    }
}
