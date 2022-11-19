package ge.softgen.softlab.tutorial.shapes;

public class Square implements Drawable {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        System.out.println("Square{" +
                "a=" + a +
                '}');
    }

}
