package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1:");
        int num1 = in.nextInt();

        System.out.println("Введите число 2:");
        int num2 = in.nextInt();

        System.out.println((num1 + num2) + ", " + (num1 - num2));
        in.close();
    }
}
