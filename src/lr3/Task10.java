package lr3;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] size = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            size[i] = random.nextInt( 100);
            System.out.println(size[i]);
        }
        int[] sizeDesc = Arrays.stream(size).boxed()
        .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sizeDesc));


    }
}
