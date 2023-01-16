package lr4;


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();

        System.out.print("Введите ключ: ");
        int shift = id.nextInt();
        String encryptString = getEncryptString(text, shift);

        System.out.print("Текст после преобразования :" + "\"" + encryptString + "\"");

        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();

            if (reply.equalsIgnoreCase("y")) {
                String geEncryptString = geEncryptString(encryptString, shift);
                System.out.println(geEncryptString);
                cool = true;
            }

            else if (reply.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                cool = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
            }
        }
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }
    public static String geEncryptString(String encryptString, int shift){

        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++){
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }
}
