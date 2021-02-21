package uti;

public class GenericSort {
	public static void main(String[] args) {
		GeometricObject[] geometricArray = {new Circle(3), new Circle(5), new Rectangle(7, 4)};
		sort(geometricArray);
		System.out.println("Sorted Geometric objects: ");
		printList(geometricArray);
	}

	/** Sort an array of comparable objects */
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i+1..list.length−2]
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	/** Print an array of objects */
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i] + " ");
		System.out.println();
	}
}
