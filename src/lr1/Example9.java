package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название месяца: ");
        String name_month = in.nextLine();

        System.out.println("Количество дней в месяце: ");
        int count_days = in.nextInt();

        System.out.println("Месяц " + name_month + " содержит " + count_days + " дней");
        in.close();
    }
}
