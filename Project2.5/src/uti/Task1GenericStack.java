package uti;

public class Task1GenericStack<E> {
	private E[] list = (E[]) new Object[3];
	private int size = 0;
	public Task1GenericStack() {
		
	}
	
	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size - 1];
	}

	public void push(E o) {
		if (size >= list.length) {
			E[] newList = (E[]) new Object[list.length*2];
			for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
			}
		} else {
			list[size++] = o;
		}
	}

	public E pop() {
		E poped = list[--size];
        return poped;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
