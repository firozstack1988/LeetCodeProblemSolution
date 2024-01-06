package dataStructure;

public  class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=right=null;
		}	
	}
	void insert(int data) {
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data) {
		if(root==null) {
			return new Node(data);
		}
		else if(data<root.data) 
			root.left=insertRec(root.left,data);
		 
		else if(data>root.data)  
			root.left=insertRec(root.right,data);
	    
		return root;
	}
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			
			inorderRec(root.right);
			System.out.print(root.data+"->");
		}
	}
	void inorder() {
		inorderRec(root);
	}
	public static void main(String ar[]) {
		BinaryTree tree=new BinaryTree();
	   tree.insert(50);
	   tree.insert(30);
	   tree.insert(20);
	   tree.insert(40);
	   tree.insert(60);
	   tree.insert(70);
	   tree.insert(80);
	   tree.inorder();
	}

}
