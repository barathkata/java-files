package datastructures;

import java.util.Stack;

public class Tree {
	TreeNode root;
private class TreeNode{
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	public TreeNode(int data) {
		this.data=data;
	}
}
public void create_tree() {
	TreeNode first=new TreeNode(1);
	TreeNode sec=new TreeNode(2);
	TreeNode thi=new TreeNode(3);
	TreeNode fou=new TreeNode(4);
	TreeNode fif=new TreeNode(5);
	TreeNode six=new TreeNode(6);
	TreeNode sev=new TreeNode(7);
	
	root=first;
	first.left=sec;
	first.right=fif;
	sec.left=thi;
	sec.right=fou;
	fif.left=six;
	fif.right=sev;
	System.out.println("tree created");
	
}

public void preorder(TreeNode root) {
	if(root==null) return;
	System.out.print(root.data);
	preorder(root.left);
	preorder(root.right);
}
public void preorder() {
	Stack<TreeNode> st=new Stack<>();
	TreeNode temp=root;
	st.push(temp);
	while(!st.isEmpty()) {
		TreeNode t=st.pop();
		System.out.println(t.data);
		if(t.right!=null) {
			st.push(t.right);
		}
		if(t.left!=null) {
			st.push(t.left);
		}
		
	}
}
public void inorder(TreeNode root) {
	if(root==null) return;//base case
	inorder(root.left);
	System.out.print(root.data);
	inorder(root.right);
	
}
public void inorder() {
	if(root==null) return;
	Stack<TreeNode> st=new Stack<>();
	TreeNode temp=root;
	while(!st.isEmpty() ||temp!=null ) {
		if(temp!=null) {
		st.push(temp);
		temp=temp.left;
		}
		else {
			temp=st.pop();
			System.out.println(temp.data);
			temp=temp.right;
		}
		
	}
	
}
public void postorder(TreeNode root) {
	if(root==null) return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data);
	
}
public void postorder() {
	Stack<TreeNode> st=new Stack<>();
	TreeNode current =root;
	while(!st.isEmpty() || current !=null) {
		if(current!=null) {
			st.push(current);
			current=current.left;
		}
		else {
			TreeNode temp=st.peek().right;
			if(temp==null) {
				temp=st.pop();
				System.out.println(temp.data);
			}
		}
	} 
}
public int findMax(TreeNode root) {
	if(root==null) return -1;
	int rootdata=root.data;
	int left=findMax(root.left);
	int right=findMax(root.right);
	if(left>rootdata) rootdata=left;
	if(right>rootdata) rootdata=right;
	
	return rootdata;
	
	
}
public static void main(String[] args) {
	Tree tr =new Tree();
	tr.create_tree();
	//tr.preorder(tr.root);
	//tr.inorder(tr.root);
	//tr.postorder(tr.root);
	//tr.preorder();
	//tr.inorder();
	int k=tr.findMax(tr.root);
	System.out.println(k);
}
}

