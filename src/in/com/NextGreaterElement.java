package in.com;

import java.util.Stack;

public class NextGreaterElement {
	public static void printArr(int arr[]) {
		int n=arr.length;
		int result[]=new int[n];
		Stack<Integer>stack=new Stack<Integer>();
		
		for(int i=n-1;i>=0;i--) //i=3  >=0  i--
		{
			while(!stack.isEmpty() && stack.peek() <=arr[i]) //25<=arr[3]
			{
				stack.pop();
			}
				if(stack.isEmpty())//
				{
					result[i]=-1;
				}else {
					result[i]=stack.peek();//3=25
				}
				stack.push(arr[i]);//25
			}
		for(int val :result)
		{
			System.out.print(val+ " ");
			
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int arr[]= {4, 5, 2, 25};
		int arr[]= {6,8,0,1,3};
		System.out.println("data is");
		printArr(arr);

	}

}
