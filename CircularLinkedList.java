package datastructures;

public class CircularLinkedList {
	private ListNode last;
	private int len;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			//this.next=null;
		}
	}
	public CircularLinkedList() {
		last=null;this.len=0;
	}
	public void addNode() {
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		
		first.next=second;
		second.next=third;
		third.next=first;
		last=third;
	}
	public void insertAtBegining(int value) {
		ListNode node = new ListNode(value);
		System.out.println(last==null);
		if(last==null) {
			last=node;
		}else {
		node.next=last.next;}
		last.next=node;
		len++;
		
	}
	public void insertAtLast(int value) {
		ListNode node=new ListNode(value);
		if(last==null) {
			last=node;
			last.next=last;
		}
		else {
			node.next=last.next;
		last.next=node;
		last=node;
		}
		len++;
	}
	public void display() {
		ListNode temp=last.next;
		if(last==null) return;
		else {
		while(temp!=last) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		}
		System.out.println(temp.data);
	}
	public void deletefirst() {
		if(last==null) return;
		else if(last.next==last) {
			last=null;
		}else {
		ListNode first=last.next.next;
		last.next=first;
		}
		len--;
	}
	public static void main(String[] args) {
		CircularLinkedList cll=new CircularLinkedList();
		cll.insertAtBegining(-11);
		cll.addNode();
		cll.insertAtBegining(-22);
		cll.insertAtLast(2);
		cll.display();
		cll.deletefirst();
		cll.display();
		System.out.println(cll.len);
	}
	
}

