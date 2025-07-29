public class IsSortedExample {

    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};
        int[] arr3 = {10};
        int[] arr4 = {};

        System.out.println("arr1 已排序？" + isSorted(arr1, 0)); 
        System.out.println("arr2 已排序？" + isSorted(arr2, 0)); 
        System.out.println("arr3 已排序？" + isSorted(arr3, 0)); 
        System.out.println("arr4 已排序？" + isSorted(arr4, 0));
    }
}
