package in.com;

public class LL {
    public static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;

    // Insert at the beginning
    public void addNode(int data) {
        Node node = new Node(data);

        if (headNode == null) {
            System.out.println("LL is empty, adding first node.");
            headNode = tailNode = node;
        } else {
            node.nextNode = headNode;
            headNode = node;
        }
    }

    public void print() {
        Node tempNode = headNode;
        System.out.println("Linked List:");
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.nextNode;
        }
        System.out.println(); // for newline
    }
    public boolean isPalindrome() {
    	Node fastNode=headNode;
    	Node slowNode=headNode;
    	while(fastNode!=null && fastNode.nextNode!=null) {
    		slowNode=slowNode.nextNode;
    		fastNode=fastNode.nextNode.nextNode;
    	}
    	Node prevNode=null;
    	Node currNode=slowNode;
    	Node next1;
    	while(currNode!=null) {
    		next1=currNode.nextNode;
    		currNode.nextNode=prevNode;
    		prevNode=currNode;
    		currNode=next1;
    	}
    	Node rightNode=prevNode;
    	Node leftNode=headNode;
    	
    	while(rightNode!=null) {
    		if(leftNode.data!=rightNode.data) {
    			return false;
    		}
    		rightNode=rightNode.nextNode;
    		leftNode=leftNode.nextNode;
    	}
    	return true;
    }
    public boolean isCycleDetect() {
        Node fastNode = headNode;
        Node slowNode = headNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;

            if (fastNode == slowNode) {
                return true; // ✅ Cycle detected here
            }
        }

        return false; // ✅ No cycle
    }


    public static void main(String[] args) {
        LL ll = new LL();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(3);
        ll.print();
        boolean ispalind= ll.isPalindrome();
        System.out.println(ispalind);
        
        boolean iscycle=ll.isCycleDetect();
        System.out.println(iscycle);
    }
}
