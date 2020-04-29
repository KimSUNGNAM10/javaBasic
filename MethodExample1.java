
public class MethodExample1 {
    public static void main(String[] args) {
        // System.out.println("result: " + sum(10, 20));
        // System.out.println("result: " + sum(10, 30));
        // System.out.println("result: " + sum(30, 40, 50));
        // System.out.println("1 ~ 10 합: " + toSum(1, 10));
        // printStar (1, 1);
        // printString("Good Morning", "F***");
        // printStar(3, "hello"); // 몇번 무엇을
        // printGugudan(7);
        printTriangle(10);
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(); // ln은 줄바꿈
            for (int k = 0; k < i; k++) {
                System.out.print("*"); // ln은 줄바꿈
            }
        }
    }

    public static void printGugudan(int dan) {
        for (int i = 1; i <= 9; i++)
            // System.out.println( dan + " * " + i + " = " + (dan * i));
            System.out.println(String.format("%d*%d=%d", dan, i, dan * i));
        // System.out.println(dan * i);
    }

    public static void printString(String str, String name) {
        System.out.println(str + ", " + name);
    }

    public static void printStar(int a, String str) { // 변수값
        for (int i = 1; i <= a; i++) { // 몇번 줄 출력??/
            System.out.println(str); // 무엇을 출력???
        }
    }

    public static void printStar(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println("  *  ");
            System.out.println(" *** ");
            System.out.println("*****");
            System.out.println(" *** ");
            System.out.println("  *  ");
        }

    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static double sum(double a, double b) {
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int c, int d, int e) {
        int sum = 0;
        sum = c + d + e;
        return sum;
    }

}