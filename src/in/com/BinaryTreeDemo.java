package in.com;


class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=null;
		right=null;
	}
}
public class BinaryTreeDemo {
	Node root;
	public BinaryTreeDemo() {
		root=null;
	}

	public Node insert(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(root.data > data) {
			root.left=insert(root.left, data);
		}
		else {
			root.right=insert(root.right, data);
		}
		return root;
	}
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public int height(Node root) {
		if(root==null) {
			return 0;
		}
		int leftside=height(root.left);
		int rightside=height(root.right);
		
		return 1+Math.max(leftside, rightside);
	}
	
	public int SumOfNodes(Node root) {
		if(root==null) 
			return 0;
		return root.data+SumOfNodes(root.left)+SumOfNodes(root.right);
	}
	
	public int maxNode(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int left=maxNode(root.left);
		int right=maxNode(root.right);
		return Math.max(root.data, Math.max(left, right));
	}
	
	public int minNode(Node root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int left=minNode(root.left);
		int right=minNode(root.right);
		return Math.min(root.data, Math.min(left, right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeDemo tree=new BinaryTreeDemo();
		tree.root=tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);
		
		
		System.out.println("inorder");
		tree.inorder(tree.root);
		System.out.println(" ");
		System.out.println("preorder");
		tree.preorder(tree.root);
		
		System.out.println(" ");
		System.out.println("postorder");
		tree.postorder(tree.root);

		System.out.println(" ");
		System.out.println("height is= "+tree.height(tree.root));
		
		System.out.println(" ");
		System.out.println("sumof nodes is="+tree.SumOfNodes(tree.root));
		
		System.out.println(" ");
		System.out.println("max nodes is="+tree.maxNode(tree.root));

		System.out.println(" ");
		System.out.println("min nodes is="+tree.minNode(tree.root));
	}

}
