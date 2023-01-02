package BenimProjemPolimorphizm;

public class ShapeTest {
    public static void main(String[] args) {
        Shape sp=new Shape();//poli degil
        Shape circle=new Circle();
        Shape square=new Square();
        Object obj=new Shape();

        System.out.println(sp.type);
        System.out.println(circle.type);
        System.out.println(square.type);
        circle.drawShape();
        ((Circle)circle).DrawCircle();


    }
}
