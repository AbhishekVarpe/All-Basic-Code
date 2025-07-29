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
		System.out.println();
	}
	public void AddMiddle(int index,int data) {
		Node nn=new Node(data);
		Node tempNode=head;
		int i=0;
		while(i<index-1) {
			tempNode=tempNode.next;
			i++;
		}
		nn.next=tempNode.next;
		tempNode.next=nn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAddFirst linkedListAddFirst=new LinkedListAddFirst();
		printData();
		linkedListAddFirst.addFirst(2);
		printData();
		linkedListAddFirst.addFirst(1);
		printData();
		linkedListAddFirst.Addlast(3);
		printData();
		linkedListAddFirst.Addlast(4);
		printData();
		linkedListAddFirst.AddMiddle(2, 1000);
		printData();

	}

}
