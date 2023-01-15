package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название текущего дня недели: ");
        String name_day = in.nextLine();

        System.out.println("Название месяца: ");
        String name_month = in.nextLine();

        System.out.println("Дата: ");
        int date = in.nextInt();

        System.out.println(name_day + ", " + date + ", " + name_month);
        in.close();
    }
}
