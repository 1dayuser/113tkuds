import java.util.Scanner;

public class serch {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        int[] S = {1,2,3,4,5,6,7,8,9,10};
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
                System.out.println("找到數字 " + x );
            } else {
                System.out.println("找不到數字 " + x );
            }
    
            scanner.close();
        }
}
}