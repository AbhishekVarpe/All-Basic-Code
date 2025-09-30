package in.com;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a no how many times rotate array");
		int k=scanner.nextInt();
		
		k=k%10;
		
		for(int i: arr) {
			System.out.print(+i+ ",");
		}
		int ans[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			ans[(i+k)%arr.length]=arr[i];
		}

		System.out.println(" right rotate array");
		System.out.println(Arrays.toString(ans));


	}

}
