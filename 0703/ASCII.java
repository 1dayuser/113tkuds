import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
        char a=sc.next().charAt(0);
        int ascii=(int)a;
        System.out.println(ascii);
        }
    }    
}
