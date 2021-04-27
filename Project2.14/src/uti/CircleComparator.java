package uti;

import java.util.Comparator;

public class CircleComparator implements Comparator<Task1ComparatorCircle>{
	public int compare(Task1ComparatorCircle o1, Task1ComparatorCircle o2) {
		return o1.radius - o2.radius;
	}

}
