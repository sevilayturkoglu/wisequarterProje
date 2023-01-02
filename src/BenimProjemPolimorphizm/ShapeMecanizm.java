package BenimProjemPolimorphizm;

import java.util.List;

public class ShapeMecanizm {


    public static Shape builtShape(String type){
        Shape shape=null;
        switch (type.toLowerCase()){
            case "shape":
                shape=new Shape();
                break;
            case "circle":
                shape=new Circle();
               break;
            case "square":
                shape=new Square();
                break;
        }return  shape;
    }

    public static void yeniSekilCiz(Shape Obj){
        Obj.drawShape();
    } public static void yeniSekilCiz(Circle Obj){
        Obj.drawShape();
    } public static void yeniSekilCiz(Square Obj){
        Obj.drawShape();
    }
    public static void sekilArry(List<Shape> mylist){
        for (Shape each:mylist) {
            System.out.println(each.type);
            each.drawShape();
        }

    }

}
