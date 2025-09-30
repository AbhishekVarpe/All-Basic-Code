package in.com;

public class demo123 {
	public static class Node{
		int data;
		Node nextNode;
		public Node(int data) {
			this.data=data;
			this.nextNode=null;
		}
		public static Node tailNode;
		public static Node headNode;
		
		public void addnode(int data) {
			Node nn=new Node(data);
			if(headNode==null) {
				headNode=tailNode=nn;
			}
			nn.nextNode=headNode;
			headNode=nn;
		}
		
		public Node findmid() {
			Node fastNode=headNode;
			Node slowNode=headNode;
			while(fastNode.nextNode!=null && fastNode!=null) {
				fastNode=fastNode.nextNode.nextNode;
				slowNode=slowNode.nextNode;
			}
			return slowNode;
		}
		
		public boolean isCycle() {
			Node fastNode=headNode;
			Node slowNode=headNode;
			while(fastNode.nextNode!=null &&fastNode!=null) {
				fastNode=fastNode.nextNode.nextNode;
				slowNode=slowNode.nextNode;
				if(fastNode==slowNode) {
					return true;
				}
			}
			return false;
		}
		
		public Node reverse()
		{
			
			Node prevNode=null;
			Node currNode=headNode;
			Node nextNod;
			while(currNode!=null) {
				Node tempNode=currNode.nextNode;
				currNode.nextNode=prevNode;
				prevNode=currNode;
				currNode=tempNode;
			}
			return prevNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
