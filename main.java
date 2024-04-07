import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;
import geometry.Square;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];

        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new ColoredCircle(new Point(1, 1), 10, "Blue");
        circles[2] = new Circle(new Point(2, 2), 15);
        circles[3] = new ColoredCircle(new Point(3, 3), 20, "Green");

        for (Circle circle : circles) {
            System.out.println("Obszar koła wynosi:" + circle.calculateArea());

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła to:" + coloredCircle.getColor());
            }
        }
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
        Square square = new Square(5.0);
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    }
}
