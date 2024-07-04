package datastructures;

public class Queue {
	private Node rear;
	private Node front;
	private int len;
	private class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void enqueue(int val) {//inserting should be done from rear end;
		Node node=new Node(val);
		if(len==0) {
			front=node;
		}
		else {
			rear.next=node;
		}
		rear=node;
		len++;
	}
	public void dequeue() {//deletion is done from front end
		if(len==0)
			return;
			Node temp=front;
			front=front.next;
			temp.next=null;
			System.out.println(temp.data);
			len--;
	}
	public void print() {
		if(len==0) {
			return;
		} else {
			Node temp=front;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	public static void main(String[] args) {
	Queue q	=new Queue();
	q.enqueue(-1);
	q.enqueue(10);
	q.enqueue(11);
	q.print();
	q.dequeue();
	q.dequeue();
	q.dequeue();
	q.print();
	}
}

