public class main {
    public static void main(String[] args) {
        Point point = new Point(1.7, 2.2);

        point.setX(3.1);
        point.setY(4.8);

        System.out.println("Współrzędne: (" + point.getX() + ", " + point.getY() + ")");
    }
}
