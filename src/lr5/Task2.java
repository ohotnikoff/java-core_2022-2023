package lr5;

public class Task2 {

    private char a;
    private char b;

    public void setA(char letter) {
        this.a = letter;
    }

    public void setB(char letter) {
        this.b = letter;
    }

    public void print(){
        if (this.b >= this.a){
            char c = this.a;
            while (c <= this.b){
                System.out.println(c);
                c++;
            }
        }
    }
}
