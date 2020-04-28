
public class ForSumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i = i + 3) {
            // for (int i = 1; i <= 100; i++)
            // if(i % 3 == 0)
            sum = sum + i;
        }
        System.out.println("1 ~ 100 합: " + sum);
    }

}