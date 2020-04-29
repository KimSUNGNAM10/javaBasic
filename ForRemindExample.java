
public class ForRemindExample {
    public static void main(final String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
              
            } else {
                System.out.println(i + " 는 홀수입니다.");
            }
        }
        System.out.println("sum: " + sum);
    }
}