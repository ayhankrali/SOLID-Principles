package openclosedprinciple;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);

    }
}
