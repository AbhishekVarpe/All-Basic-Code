package in.com;

public class MyStack{
		int stack[];
		private int top;
		private int size;
		public MyStack(int size) {
			stack=new int[size];
			this.top=-1;
			this.size=size;
		}
		public boolean isfull() {
			return top==size-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public void push(int data)
		{
			if(isfull()) {
				System.out.println("stack is full");
				return;
			}
			stack[++top]=data;	
		}
		public int pop() {
			if(isEmpty()) {
				System.out.println("stack is empty");
				return -1;
			}
			return stack[top--];
		}
		public int peek() {
			if(!isEmpty()) {
				System.out.println("top element");
				return stack[top];
			}
			return -1;
		}
		public void printStack() {
		    for (int i = 0; i <= top; i++) {
		        System.out.print(stack[i] + " ");
		    }
		    System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack=new MyStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.printStack();
        System.out.println(stack.peek());	
        System.out.println("pop data="+stack.pop());

	}

}
