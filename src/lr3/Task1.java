package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число в диапазоне от 1 до 7");
        int num = in.nextInt();
        String[] nameDays = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String result = "Введено некорректное значение";

        switch (num) {
            case 1 -> result = nameDays[0];
            case 2 -> result = nameDays[1];
            case 3 -> result = nameDays[2];
            case 4 -> result = nameDays[3];
            case 5 -> result = nameDays[4];
            case 6 -> result = nameDays[5];
            case 7 -> result = nameDays[6];
        }
        System.out.println(result);
    }
}
