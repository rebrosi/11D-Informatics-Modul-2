package uti;

public class Rectangle extends GeometricObject{
	private int height;
	private int width;
	
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public int max(Rectangle r) {
		return this.compareTo(r);
	}
	
	public int getArea() {
		return area = height * width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String toString() {
		return "rectangle: height: " + height + ", width: " + width + ", area: " + getArea();
	}

}
