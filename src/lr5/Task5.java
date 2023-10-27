package lr5;

public class Task5 {

    private int a;

    public Task5() {
        this.a = 0;
    }

    public Task5(int a) {
        if (a > 100) {
            a = 100;
        }
        this.a = a;
    }

    public void setValue() {
        this.a = 0;
    }

    public void setValue(int a) {
        if (a > 100) {
            a = 100;
        }
        this.a = a;
    }

    public int getValue() {
        return this.a;
    }
}
