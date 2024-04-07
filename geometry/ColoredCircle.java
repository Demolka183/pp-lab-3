package geometry;

public class ColoredCircle extends geometry.Circle {
    private String color;
    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
