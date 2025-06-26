public class ds_05 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 9, 34, 21, 16, 8, 43, 27, 10};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  
        }

        System.out.println("所有元素的總和是：" + sum);
    }
}
