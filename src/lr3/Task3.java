package lr3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1]+ arr[i - 2];
        } for (int i = 1; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
