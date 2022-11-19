package ge.softgen.softlab.tutorial.shapes;

import java.util.List;

public class DrawService {

    public void drawShapes (List<Drawable> shapes) {
        for (Drawable drawable: shapes) {
            drawable.draw();
        }
    }
}
