package ContohOOShape;
public class CallShapeCalculator {
    public static void main(String[] args) {
        Shape c = new Circle(10);
        Shape r = new Rectangle(12, 10);
        Shape t = new Triangle(9, 8);

        ShapeCalculator calculator = new ShapeCalculator();
        calculator.printArea(c);
        calculator.printArea(r);
        calculator.printArea(t);
    }
}
