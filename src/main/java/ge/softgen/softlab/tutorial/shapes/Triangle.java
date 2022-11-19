package ge.softgen.softlab.tutorial.shapes;

public class Triangle implements Drawable {

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}');
    }


}
