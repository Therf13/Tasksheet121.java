import static java.lang.Math.*;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("75 + 25 = " + Math.addExact(75, 25));
        System.out.println("200 - 100 = " + Math.subtractExact(200, 100));
        System.out.println("10 * 10 = " + Math.multiplyExact(10, 10));
        System.out.println("200 / 2 = " + Math.floorDiv(200, 2));
    }
}

