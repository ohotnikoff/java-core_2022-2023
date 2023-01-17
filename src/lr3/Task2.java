package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = in.nextLine();

        switch (day) {
            case "Понедельник" -> System.out.println("1");
            case "Вторник" -> System.out.println("2");
            case "Среда" -> System.out.println("3");
            case "Четверг" -> System.out.println("4");
            case "Пятница" -> System.out.println("5");
            case "Суббота" -> System.out.println("6");
            case "Воскресенье" -> System.out.println("7");
            default -> System.out.println("Такого дня нет");
        }
    }
}
