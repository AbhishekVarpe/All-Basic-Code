package in.com;



public class LinkedListAddFirst {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
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

	public static void sizeOFLL() {
		Node tempNode=head;
		int count=0;
		while(tempNode!=null) {
			count++;
			tempNode=tempNode.next;
			
		}
		System.out.println("count of data = "+count);
	}
	public int removeFirst() {
		int val=head.data;
		head=head.next;
		return val;
	}
	public void removeLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			head = tail = null;
			return;
		}
		Node prev = head;
		while (prev.next != tail) {
			prev = prev.next;
		}
		prev.next = null;
		tail = prev;
	}

	public int itrSearch(int key) {
		Node tempNode=head;
		int i=0;
		while(tempNode!=null) {
			if(tempNode.data==key) {
				return i;
			}
			tempNode=tempNode.next;
			i++;
		}
		return -1;
	}
	public int removeNthNode(int n) {
		int size=0;
		Node tempNode=head;
		while(tempNode!=null) {
			tempNode=tempNode.next;
			size++;
		}
		if(size==n) {
			head=head.next;
			return 0;
		}
		int i = 1;
		int itofind=size-n;
		Node prevNode = head;
		while (i < itofind) {
			prevNode = prevNode.next;
			i++;
		}
		prevNode.next = prevNode.next.next;
		return itofind;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAddFirst linkedListAddFirst=new LinkedListAddFirst();
		printData();
		linkedListAddFirst.addFirst(1);
		printData();
		linkedListAddFirst.addFirst(2);
		linkedListAddFirst.addFirst(3);
		linkedListAddFirst.addFirst(4);
		linkedListAddFirst.addFirst(5);
		linkedListAddFirst.addFirst(6);
		linkedListAddFirst.addFirst(7);
		printData();
	//	linkedListAddFirst.Addlast(3);
	//	printData();
	//	linkedListAddFirst.Addlast(4);
	//	printData();
		//linkedListAddFirst.AddMiddle(2, 1000);
		//printData();
		//sizeOFLL();
        printData();
      //  int data1=linkedListAddFirst.removeFirst();
      //  System.out.println(data1);
//         printData();
//         System.out.println("delete last node");
//         linkedListAddFirst.removeLast();
//         printData();
//		
    //    System.out.println(linkedListAddFirst.itrSearch(3));
       // printData();
        System.out.println("delete nth node");
        int remove=linkedListAddFirst.removeNthNode(5);
        System.out.println(remove);
        //printData();
	}

}
