package datastructures;

public class BST {
private Node root;
private class Node{
	private int data;
	private Node left;
	private Node right;
	public Node(int data) {
		this.data=data;
	}
}
public void insert(int value) {
	root=insert(root,10);
}
public Node insert(Node root,int value) {
	if(root==null) {
		root=new Node(value);
		return root;
	} 
	if(value<root.data
			) {
		root.left=insert(root.left,value);
	}else {
		root.right=insert(root.right,value);
	}
	return root;
}
public void display() {
	System.out.println(root.data);
	//System.out.println(root.left.data);
	System.out.println(root.right.data);
}
public void inorder() {
	inorder(root);
}
public void inorder(Node root) {
	if (root==null) return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
	
}
public static void main(String[] args) {
	BST bst=new BST();
	bst.insert(10);
	bst.insert(5);
	bst.insert(11);
	//bst.display();
	
	bst.inorder();
	
}
}

