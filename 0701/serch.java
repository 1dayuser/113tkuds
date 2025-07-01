import java.util.Scanner;

public class serch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] S = {};
        System.out.print("輸入要找的數:");
        int x = scanner.nextInt();
        boolean found = false;
        for(int num:S){
            if(num==x){
                found=true;
                break;
            }
        }
        if(found){
            if (found) {
                System.out.println("找到數字 " + x );
            } else {
                System.out.println("找不到數字 " + x );
            }
    
            scanner.close();
        }
    }
}
