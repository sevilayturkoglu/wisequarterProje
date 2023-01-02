package BenimProjemPolimorphizm;

public class Circle extends Shape{
    public Circle() {
        super();
        type="circle";
    }
    @Override
    public void drawShape() {
        System.out.println("Draw a circle  ");
    }public void DrawCircle(){
        System.out.println("Ben sadece Circle clasinda normal bir metodum  ");
    }
}
