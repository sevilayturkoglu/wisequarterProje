package BenimProjemPolimorphizm;

public class Square extends Shape {

    public Square() {
        type = "square";

    }
    @Override
    public void drawShape() {
        System.out.println("Draw a square");
    }
}