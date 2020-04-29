
public class ForRead2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if ((i % 2 == 0 && i % 3 == 0)) {
                System.out.println("2 와 3의 배수:" + i);
            }
            else if ((i % 2 == 0 || i % 3 == 0)) {
                System.out.println("2 또는 3의 배수:" + i);
            }
        }
    }
}