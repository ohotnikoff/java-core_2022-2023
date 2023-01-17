package lr4;

public class Task4 {
    public static void main(String[] args) {
        char[][] rectangle = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                rectangle[i][j] = '*';
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(rectangle[i]);
        }
    }
}
