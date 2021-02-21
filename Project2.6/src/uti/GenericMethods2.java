package uti;

import java.util.ArrayList;
import java.util.Collections;

public class GenericMethods2 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(13);
		intList.add(36);
		intList.add(90);
		shuffle(intList);
		sort(intList);
		System.out.println(min(intList));
	}
	public static <E> void shuffle(ArrayList<E> list) {
		Collections.shuffle(list);
		System.out.println(list);
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		Collections.sort(list);
		System.out.println(list);
	}
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		return Collections.min(list);
		
	}


}
