package uti;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Task4 {
	public static void main(String[] args) {
		PriorityQueue<String> p1 = new PriorityQueue<String>();
		p1.add("George");
		p1.add("Jim");
		p1.add("John");
		p1.add("Blake");
		p1.add("Kevin");
		p1.add("Michael");
		PriorityQueue<String> p2 = new PriorityQueue<String>();
		p2.add("George");
		p2.add("Katie");
		p2.add("Kevin");
		p2.add("Michelle");
		p2.add("Ryan");
		System.out.println("Priority queue 1:" + p1);
		System.out.println("Priority queue 2:" + p2);
		System.out.println("Priority queues 1 and 2 union:" + union(p1, p2));
		System.out.println("Priority queues 1 and 2 intersection:" + intersection(p1, p2));
		System.out.println("Priority queues 1 and 2 difference:" + difference(union(p1, p2), intersection(p1, p2)));
	}
	public static PriorityQueue<String> union(PriorityQueue<String> p1, PriorityQueue<String> p2){
	    PriorityQueue<String> united = new PriorityQueue<>();
	    united.addAll(p1);
	    united.addAll(p2);
	    return united;
	}
	public static PriorityQueue<String> intersection(PriorityQueue<String> p1, PriorityQueue<String> p2) {
		PriorityQueue<String> intersected = new PriorityQueue<>(p1);
		intersected.retainAll(new PriorityQueue<>(p2));
		return intersected;
	}

	public static PriorityQueue<String> difference(PriorityQueue<String> p1AndP2, PriorityQueue<String> intersectionQueue) {
		PriorityQueue<String> different = new PriorityQueue<>(p1AndP2);
		different.removeAll(new PriorityQueue<>(intersectionQueue));
		return different;
	}
}
