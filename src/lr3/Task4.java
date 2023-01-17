package lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println( + i);
        }
        while (a <= b) {
            System.out.printf("%d, ", + a);
            a++;
        }

    }
}
