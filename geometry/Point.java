package geometry;
public class Point {
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(int z) {
		x = z;
	}
	public void setY(int z) {
		y = z;
	}
	public Point(){
		System.out.println("Jestem konstruktorem");
		x = 0;
		y = 0;
	}
	
}
