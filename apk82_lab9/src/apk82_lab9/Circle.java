package apk82_lab9;

public class Circle {
	protected double radius;
	protected String color;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double area = radius*radius;
		area*=3.14;
		return area;
	}
}
