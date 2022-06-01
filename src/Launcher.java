/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Launcher {
    public static void main(final String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        System.out.println(mod(a, b));
        System.out.println(pow(a, b));
        System.out.println(min(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static int mod(int a, int b) {
        return a % b;
    }

    private static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    private static int min(int a, int b) {
        return Math.min(a, b);
    }
}
