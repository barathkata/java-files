package datastructures;

public class Doublylinkedlist {
	private ListNode head;
	private ListNode tail;
	private int length;
private class ListNode{
	private ListNode previous;
	private ListNode next;
	private int data;
	public ListNode(int data) {
		this.data=data;
	}
	
}
public Doublylinkedlist() {
	this.head=null;
	this.tail=null;
	this.length=0;
}
public void insertAtLast(int value) {
	ListNode node=new ListNode(value);
	if(length==0) {
		head=node;
	}
	else {
		tail.next=node;
	}
	node.previous=tail;
	tail=node;
	length++;
}


public void inserAtFirst(int value) {
	ListNode node=new ListNode(value);
	if(length==0) {
		head=node;
	}else {
	head.previous=node;
	}
	node.next=head;
	head=node;
}
public void insertAtaPos(int pos,int value) {
	int count=0;
	ListNode node=new ListNode(value);
	ListNode store=null;
	ListNode temp=head;
	while(count<pos) {
		
		temp=temp.next;
	}
	temp.next=store;
	temp.next=node;
	node.next=store;
}
public void displayForward() {
	if(head==null) {
		return;
	}
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"<-->");
		temp=temp.next;
	}
	System.out.println("null");
}
public void displayBackward() {
	if(head==null) {
		return;
	}
	ListNode temp=tail;
	while(temp!=null) {
	System.out.print(temp.data+"<-->");
	temp=temp.previous;
	}
	System.out.println("null");
}
public ListNode deleteLast() {
	ListNode temp=tail;
	tail.previous.next=null;
	tail=tail.previous;
	temp.previous=null;
	return temp;
}
public static void main(String[] args) {
	Doublylinkedlist dll=new Doublylinkedlist();
	dll.insertAtLast(00);
	dll.insertAtLast(11);
	dll.insertAtLast(33);
	dll.insertAtLast(44);
	dll.inserAtFirst(-11);
	//dll.insertAtaPos(3,22);
	
	//dll.displayBackward();
	ListNode k=dll.deleteLast();
	System.out.println(k.data);
	dll.displayForward();
}
}

