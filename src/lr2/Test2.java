package lr2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        if((x / 5 == 2) && (x / 7 == 1)){
            System.out.println("Введеное число удовлетворяет критериям");
        } else {
            System.out.println("Введеное число не удовлетворяет критериям");
        }
    }
}
