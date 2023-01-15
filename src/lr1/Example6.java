package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Фамилия: ");
        String lastname = in.nextLine();

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Отчество: ");
        String surname = in.nextLine();

        System.out.println("Hello " + lastname + ", " + name + ", " + surname);
        in.close();
    }
}
