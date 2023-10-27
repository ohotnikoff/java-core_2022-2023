package lr5;

public class Main5 {
    public static void main(String[] args) {
        Task5 test1 = new Task5();
        System.out.println(test1.getValue());
        test1.setValue(150);
        System.out.println(test1.getValue());
        test1.setValue();
        System.out.println(test1.getValue());
        test1.setValue(50);
        System.out.println(test1.getValue());

        Task5 test2 = new Task5(100);
        System.out.println(test2.getValue());
    }
}
