package lr5;

public class Task4 {

    public char c;
    public int a;

    public Task4(char c, int a) {
        this.c = c;
        this.a = a;
    }

    public Task4(double x) {
        this.c = (char)x;
        this.a = (char)((x - (char)x) * 100);
    }
}
