package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int year = in.nextInt();
        int age = 2023 - year;

        System.out.println(name + " " + age);
        in.close();
    }
}
