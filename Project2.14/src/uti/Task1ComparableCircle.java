package uti;

public class Task1ComparableCircle implements Comparable<Task1ComparableCircle> {
	private int radius;
	
	Task1ComparableCircle(int radius){
		this.radius = radius;
	}
	
	public int max(Task1ComparableCircle c) {
		return this.compareTo(c);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "radius: " + radius;
	}

	@Override
	public int compareTo(Task1ComparableCircle o) {
		// TODO Auto-generated method stub
		return this.radius - o.radius;
	}
	
}

