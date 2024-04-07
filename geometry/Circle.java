package geometry;
public class Circle {
    private geometry.Point center;
    private double radius;
    public Circle(geometry.Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public geometry.Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
