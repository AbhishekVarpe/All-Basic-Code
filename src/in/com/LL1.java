package in.com;

public class LL1 {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public void addNode(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=tail=nn;
		}
		else {
			nn.next=head;
			head=nn;
		}
	}
	public void printdata() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(+temp.data+"->");
			temp=temp.next;
		}
	}
	
	public void Reverse() {
		System.out.println("reverse order");
		Node prev=null;
		Node curr= head;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		
		Node tempNode=head;
		while(tempNode!=null) {
			System.out.print(tempNode.data+"->");
			tempNode=tempNode.next;
		}
	}
	public Node findMid() {
		Node slowNode=head;
		Node fastNode=head;
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}
		return slowNode;
	}
	public static void main(String[] args) {
		LL1 ll1=new LL1();
		ll1.addNode(1);
		ll1.addNode(2);
		ll1.addNode(3);
		ll1.addNode(4);
		ll1.addNode(5);
		ll1.addNode(6);
		ll1.printdata();
		ll1.Reverse();
		
		Node data=ll1.findMid();
		
		System.out.println("mid data"+data.data);
		

	}

}
