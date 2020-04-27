
public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2; // 2
        double result1 = (double) v1 / v2;
        System.out.println(result1);

        result = sum(20, 15);
        System.out.println("result:" + result);

        result = minus(20, 15);
        System.out.println("result:" + result);

        result1 = divide(30, 15);
        System.out.println("result1:" + result1);
    }

    public static int sum(int num3, int num4) {
        int result = num3 + num4;
        return result;
    }

    public static int minus(int num3, int num4) {
        int result = num3 - num4;
        return result;
    }

    public static double divide(int num3, int num4) {
        return (double) num3 / num4;
        
    }
}