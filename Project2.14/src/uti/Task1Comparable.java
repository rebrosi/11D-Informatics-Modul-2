package uti;

public class Task1Comparable {
	/** The method for sorting the numbers */
	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if (list.length > 1) {
// Merge sort the first half
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1].compareTo(list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	/** A test method */
	public static void main(String[] args) {
		Task1ComparableCircle[] list = { new Task1ComparableCircle(2), new Task1ComparableCircle(3),new Task1ComparableCircle(2), new Task1ComparableCircle(5), new Task1ComparableCircle(6), new Task1ComparableCircle(1),
				new Task1ComparableCircle(12), new Task1ComparableCircle(3), new Task1ComparableCircle(14), new Task1ComparableCircle(12) };
		mergeSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
