package lr4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] data = new int[5][10];
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                data[i][j] = r.nextInt(100);
            }
        }

        System.out.println("==========");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposed = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                transposed[i][j] = data[j][i];
            }
        }

        System.out.println("\r\n========");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
