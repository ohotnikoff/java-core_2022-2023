package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваш возраст: ");
        int age = in.nextInt();
        int year = 2023 - age;

        System.out.println("Год рождения: " + year);
        in.close();
    }
}