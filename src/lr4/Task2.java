package lr4;

public class Task2 {
    public static void main(String[] args) {
        int figure = 8;
        int i;
        int j;
        int z = 0;

        for (i = 1; i <= figure; i++) {
            System.out.println(" ");
            for (j = 0; j <= z; j++){
                System.out.print("1");
            }

            z = z + 1;
        }
        System.out.println(" ");
    }
}
