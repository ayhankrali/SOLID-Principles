package liskovsubstitution;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        printArea(rectangle);

        Rectangle square = new Square(5);
        printArea(square);
    }

    public static void printArea(Rectangle rectangle) {
        rectangle.setWidth(6);
        rectangle.setHeight(8);
        System.out.println("Area: " + rectangle.getArea());
    }

}
