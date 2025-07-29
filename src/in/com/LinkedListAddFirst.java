package in.com;



public class LinkedListAddFirst {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=next;
		}
		
	}
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) 
	{
		Node nn=new Node(data);
		if(head==null) {
			head=tail=nn;
			return;
			
		}
		nn.next=head;
		head=nn;
	}
	
	public void Addlast(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=tail=nn;
			return;
		}
		tail.next=nn;
		tail=nn;
		
	}
	public static void printData() {
		Node temp=head;
		if(temp==null) {
			System.out.println("LL is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAddFirst linkedListAddFirst=new LinkedListAddFirst();
		linkedListAddFirst.addFirst(2);
		linkedListAddFirst.addFirst(1);
		linkedListAddFirst.Addlast(3);
		linkedListAddFirst.Addlast(4);
		printData();

	}

}
