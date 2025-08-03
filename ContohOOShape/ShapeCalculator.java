package ContohOOShape;
public class ShapeCalculator {

    public void printArea(Shape shape) {
        System.out.printf("{ %s } Area: %.2f\n", shape.getName(), shape.calculateArea());
    }
}
