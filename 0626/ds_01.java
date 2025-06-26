import java.util.Scanner;

public class ds_01 {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){
        
        System.out.println("輸入數字");
        int num1=scanner.nextInt();
        
        System.out.println("輸入數字");
        int num2=scanner.nextInt();

        int sum=num1+num2;

        System.out.println("兩數和"+sum);
        scanner.close();
        }
            
    }


}
