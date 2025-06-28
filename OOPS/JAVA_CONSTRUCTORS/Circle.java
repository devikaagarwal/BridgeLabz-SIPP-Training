package OOPS.JAVA_CONSTRUCTORS;

public class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: " + defaultCircle.radius);

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle Radius: " + customCircle.radius);
    }
}
