package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();
        int num_min = num - 1;
        int num_max = num + 1;
        double result = Math.pow((num + num_min + num_max), 2);

        System.out.println(num_min + ", " + num + ", " + num_max + ", " + result);
        in.close();
    }
}
