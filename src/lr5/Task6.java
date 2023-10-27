package lr5;

public class Task6 {
    private int max;
    private int min;

    public Task6(int a) {
        if (a > 0) {
            this.max = a;
            this.min = 0;
        } else {
            this.max = 0;
            this.min = a;
        }
    }

    public Task6(int a, int b) {
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }
        this.min = a;
        this.max = b;
    }

    public void setValues(int a, int b) {
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }
        if (a < this.min) {
            this.min = a;
        }
        if (b > this.max) {
            this.max = b;
        }
    }

    public void setValue(int a) {
        if (a > this.max) {
            this.max = a;
        }
        if (a < this.min) {
            this.min = a;
        }
    }

    public void print() {
        System.out.println(this.min + " " + this.max);
    }
}
