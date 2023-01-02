package BenimProjemPolimorphizm;
import java.util.ArrayList;
import java.util.List;
import static BenimProjemPolimorphizm.ShapeMecanizm.*;
public class ShapeMecanizmTest {

    public static void main(String[] args) {
        ShapeMecanizm.yeniSekilCiz(ShapeMecanizm.builtShape("circle"));
        ShapeMecanizm.yeniSekilCiz(ShapeMecanizm.builtShape("shape"));
        ShapeMecanizm.yeniSekilCiz(ShapeMecanizm.builtShape("square"));
        yeniSekilCiz(builtShape("circle"));
        yeniSekilCiz(builtShape("shape"));
        yeniSekilCiz(builtShape("square"));
        yeniSekilCiz((Circle) builtShape("circle"));

        List<Shape> mylist = new ArrayList<>();
mylist.add(new Shape());
mylist.add(new Circle());
mylist.add(new Square());

sekilArry(mylist);
    }
}