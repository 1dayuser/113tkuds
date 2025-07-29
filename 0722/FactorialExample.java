public class FactorialExample {

    public static String factorialWithSteps(int n) {
        if (n == 0 || n == 1) {
            return n + "! = 1";
        }

        int result = 1;
        StringBuilder steps = new StringBuilder();
        steps.append(n + "! = ");

        for (int i = 2; i <= n; i++) {
            result *= i;
            steps.append(i);
            if (i < n) {
                steps.append(" * ");
            }
        }

        steps.append(" = " + result);
        return steps.toString();
    }

    public static void main(String[] args) {
        System.out.println(factorialWithSteps(3));
        System.out.println(factorialWithSteps(5));
        System.out.println(factorialWithSteps(0));
    }
}
