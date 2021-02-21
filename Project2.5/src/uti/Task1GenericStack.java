package uti;

public class Task1GenericStack<E> {
	//private java.util.ArrayList <E> list = new java.util.ArrayList<>();
	private E[] list;
	private int stackTop;
	public Task1GenericStack() {
		stackTop = -1;
	}
	
	public int getSize() {
		return list.length;
	}

	public E peek() {
		return list[stackTop];
	}

	public void push(E o) {
		if (stackTop + 1 == list.length) {
			E[] newList;
			//newList.length = 2 * list.length;
			for (int i = 0; i < list.length; i++) {
				//newList[i] = list[i];
			}
		} else {
			list[++stackTop] = o;
		}
	}

	public E pop() {
		E poped = list[stackTop];
        list[stackTop] = null;
        stackTop--;
        return poped;
	}

	public boolean isEmpty() {
		return stackTop == -1 ? true:false;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}