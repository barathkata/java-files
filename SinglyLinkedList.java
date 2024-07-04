package datastructures;

public class SinglyLinkedList1 {
	private  ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
	}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.println("null");
	}
	public int countElements() {
		int count=1;
		ListNode current =head;
		while(current.next!=null) {//t,t,t
			count++;//2,3,4
			current=current.next;//pointing to 10,11
		}
		return count;
	}
	public void insertAtBegining(ListNode value) {
		value.next=head;
		head=value;
		
	}
	public void insertAtEnd(ListNode value) {
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=value;
	}
	public void insertAtAnyPos(ListNode node,int pos) {
		int count=1;
		ListNode current=head;
		ListNode value=null;
		while(count<pos-1) {
			current=current.next;
			count++;
		}
		value=current.next;
		current.next=node;
		node.next=value;
	}
	public ListNode deleteAtBegining() {
		if(head==null||head.next==null) {
			return head;
		}
		ListNode current=head;//current=9
		head=head.next;//head=10
		current.next=null;//
		return current;
	}
	public ListNode deleteLast() {
		ListNode previous=null;
		ListNode current =head;
		while(current.next!=null) {
			previous = current;
			current=current.next;
		}
		previous.next=null;
		return current;
	}
	public void deleteAtAnyPos(int pos) {
		if(pos==1) {
			head=head.next;
		}else {
		int count=1;
		ListNode previous=head;
		while(count<pos-1) {
		previous=previous.next;
		count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
	}
	}
	public boolean searchForElement(int value) {
		int count=1;
		ListNode current=head;
		while(current!=null) {
			if(current.data==value) {
				System.out.println("found at position: "+count);
				return true;
			}
			current=current.next;
			count++;
			
			
		}
		return false;
	}/*
	public ListNode reverseLinkedList(ListNode head) {
		ListNode current=head;
		ListNode previous=null;
		ListNode after=null;
		while(current!=null) {
			after=current.next;
			current.next=previous;
			previous=current;
			current=after;
		}
		return previous;
	}*/
	public int lastto2() {
		
		ListNode current=head;
		ListNode previous=null;
		
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		return previous.data;
	}
	
	public int last_to_n(int n) {
		ListNode actual=head;
		ListNode ref=head;
		int count=0;
		while(count<n) {
			ref=ref.next;
			count++;
		}
		while(ref!=null) {
			ref=ref.next;
			actual=actual.next;
		}
		return actual.data;
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList1 sl=new SinglyLinkedList1();
		sl.head=new ListNode(10);//10->null
		ListNode second=new ListNode(11);//11->null
		ListNode third=new ListNode(12);//12->null
		ListNode fourth=new ListNode(13);//13->null
		ListNode fifth=new ListNode(14);//14->null
		ListNode sixth=new ListNode(14);
		sl.head.next=second;//10->11->null
		second.next=third;//10->11->12->null
		third.next=fourth;//10->11->12->13->null
		fourth.next=fifth;//10->11->12->13->14->null
		fifth.next=sixth;
		
		sl.insertAtBegining(new ListNode(9));
		sl.insertAtEnd(new ListNode(15));
		//System.out.println(sl.deleteAtBegining().data);
		//System.out.println(sl.deleteLast().data);
		sl.insertAtAnyPos(new ListNode(15),3);
		sl.deleteAtAnyPos(3);
		boolean flag=sl.searchForElement(12);
		System.out.println(flag);
		sl.display();
		System.out.println(sl.countElements());
		int k=sl.lastto2();
		System.out.println(k);
		int k1=sl.last_to_n(2);
		System.out.println(k1);	

	}
}

