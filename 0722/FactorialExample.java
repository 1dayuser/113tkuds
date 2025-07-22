public class FactorialExample {
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("3! = " + factorial(3)); 
        System.out.println("5! = " + factorial(5)); 
        System.out.println("0! = " + factorial(0)); 
    }
}
