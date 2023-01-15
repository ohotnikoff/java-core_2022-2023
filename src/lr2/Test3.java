package lr2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();

        int result = x % 4;
        if ((result == 0) && (x >= 10)){
            System.out.println("Введеное число удовлетворяет критериям");
        } else {
            System.out.println("Введеное число не удовлетворяет критериям");
        }
    }
}
