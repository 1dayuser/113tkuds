import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double sum =a+b;
        System.out.println(sum);
    }    
}    
}