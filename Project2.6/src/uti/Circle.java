package uti;

public class Circle extends GeometricObject {
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public int max(Circle c) {
		return this.compareTo(c);
	}
	
	public int getArea () {
		return area = (int) (Math.PI * Math.pow(radius, 2));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "circle: radius: " + radius + ", area: " + getArea();
	}
	
}

