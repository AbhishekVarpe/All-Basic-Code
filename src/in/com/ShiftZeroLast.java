package in.com;

public class ShiftZeroLast {
	public static void printdate(int arr[]) {
		int index=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0)
			arr[index++]=arr[i];
		}
		
		while(index<n) {
			arr[index++]=0;
		}
		
		for(int val :arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,0,3,0,4,5,6,7,0,9};
		printdate(arr);

	}

}
