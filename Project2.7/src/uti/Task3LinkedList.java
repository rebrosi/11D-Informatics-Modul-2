package uti;

import uti.Task1DLL.Node;

public class Task3LinkedList {
	Node head;
	
	 class Node {
	     int data;
	     Node prev;
	     Node next;
	     
	     Node(int d) {
	    	 data = d; 
	    }
	 }

	 public void add(int new_data) {
	     Node new_node = new Node(new_data);
	     Node last = head;
	     new_node.next = null;
	     if (head == null) {
	         new_node.prev = null;
	         head = new_node;
	         return;
	     }
	     while (last.next != null)
	         last = last.next;
	     last.next = new_node;
	     new_node.prev = last;
	 }
	 
	 public String printListNormal(Node node){
		 String text = "";
	     Node last = null;
	     while (node != null) {
	        text += node.data + " ";
	         last = node;
	         node = node.next;
	     }
	     return text;
	 }
	 
	 public String printListReversed(Node node){
		 String text = "";
	     Node last = null;
	     while (last != null) {
	         text += last.data + " ";
	         last = last.prev;
	     }
	     return text;
	 }
	 public void sortList() {  
	        Node currentElement = null, nextElement = null;  
	        int temp;  
	        if(head == null) {  
	            return;  
	        }  
	        else {   
	            for(currentElement = head; currentElement.next != null; currentElement = currentElement.next) {  
	                for(nextElement = currentElement.next; nextElement != null; nextElement = nextElement.next) { 
	                    if(currentElement.data > nextElement.data) {  
	                        temp = currentElement.data;  
	                        currentElement.data = nextElement.data;  
	                        nextElement.data = temp;  
	                    }  
	                }  
	            }  
	        }  
	    } 
	 public void shuffle() {
		 Node temp = head;
		 int randomX = (int) (Math.random() * 10 + 1);

		 //simply go until the randomX
		 while(randomX-- > 0 && temp.next != null)
		     temp = temp.next;

		 //remove the Nth node from the list
		 temp.prev = temp.next.next;

		 if(temp.next != null)
		     temp.next = temp.prev.prev;

		 //set it to point to the head
		 temp.next = head;
		 temp.prev = null;

		 //now set the Head to the Nth node we found
		 head = temp;
	 }
	 
}
