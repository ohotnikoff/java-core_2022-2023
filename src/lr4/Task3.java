package lr4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        char[][] rectangle = new char[10][20];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(rectangle[i], '2');
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(rectangle[i]);
        }

    }
}
