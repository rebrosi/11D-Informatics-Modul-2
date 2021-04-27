package uti;

 abstract public class GeometricObject implements Comparable <GeometricObject>{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public int area;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.setColor(color);
		this.setFilled(filled);
	}
	public static void max(GeometricObject obj) {
	}
	
	public int compareTo(GeometricObject obj) {
		return obj.getArea() - area;
	}
	
	public abstract int getArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract String toString();
	
}

