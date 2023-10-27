package lr5;

public class Main6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6(5, 10);
        task6.print();
        task6.setValue(20);
        task6.print();
        task6.setValue(0);
        task6.print();

        task6 = new Task6(-5);
        task6.print();
        task6.setValues(10, 5);
        task6.print();
    }
}
