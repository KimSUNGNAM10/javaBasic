
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1; // 1
        sum = sum + 2; // 3
        sum = sum + 3; // 6
        sum = sum + 4; // 10
        sum = sum + 5; // 15
        sum = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println(2 + " * " + i + " = " + (2 * i));
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(3 + " * " + i + " = " + (3 * i));
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(4 + " * " + i + " = " + (4 * i));
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(5+ " * " + i + " = " + (5 * i));
        }
    }
}