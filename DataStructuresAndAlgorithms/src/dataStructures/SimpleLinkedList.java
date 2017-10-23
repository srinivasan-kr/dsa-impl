/**
 * 
 */
package dataStructures;

/**
 * @author srinivasan
 * @version 0.1
 *
 */

/*
 *TODO:Using strings as data element, use generics instead
 * */
public class SimpleLinkedList {
	Node head; //Head ptr
	Node tail; //Tail ptr
	long size; //Size of elements
	
	public class Node{
		String data;
		Node next;
	}
	
	public SimpleLinkedList() {
		head = tail = null;
		size=0;
	}
	
	public void add() {}
	
	public void remove() {}
	
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	
}
