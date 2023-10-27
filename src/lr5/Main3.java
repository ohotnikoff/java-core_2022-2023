package lr5;

public class Main3 {
    public static void main(String[] args) {
        Task3 v1 = new Task3();
        System.out.println(v1.a + ", " + v1.b);
        Task3 v2 = new Task3(1);
        System.out.println(v2.a + ", " + v2.b);
        Task3 v3 = new Task3(1, 2);
        System.out.println(v3.a + ", " + v3.b);
    }
}
