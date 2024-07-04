package datastructures;

import java.util.EmptyStackException;

/*stack is a linear datastructure used for storing data
 * it is an ordered list in which insertion and deletion are done at one end(top)
 * follows lifo
 */
public class Stack {
	private ListNode top;
	private int len;
private class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public Stack() {
	top=null;
	len=0;
}
public int length() {
	return len;
}
public boolean isEmpty() {
	return len==0;
}
public void push(int value) {
	ListNode first=new ListNode(value);
	first.next=top;
	top=first;
	len++;
	
}
public int  pop() {
	if(isEmpty()) {throw new EmptyStackException();}
	int result=top.data;
	top=top.next;len--;
	return result;
}
public void peek() {
	if(isEmpty()) {throw new EmptyStackException();}
	else {
		System.out.println(top.data);
	}
	
}
public void display() {
	ListNode temp=top;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println();
}
public static void main(String[] args) {
	Stack st=new Stack();
	st.push(0);
	st.push(1);
	st.push(2);
	
	st.pop();
	st.display();
	st.peek();
}
}

