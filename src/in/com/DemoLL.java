package in.com;

public class DemoLL {
    
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail of Linked List
    public static Node head = null;
    public static Node tail = null;

    // Method to add node at the end
    public void addNode(int data) {
        Node nn = new Node(data);
        if (head == null) {   // if list is empty
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    // Method to print Linked List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DemoLL demoLL = new DemoLL();

        demoLL.addNode(1);
        demoLL.addNode(2);
        demoLL.addNode(3);

        demoLL.printList();   // Output: 1 2 3
    }
}
