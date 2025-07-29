package in.com;

public class SortOneTwoThree {
	public static void SortArray(int arr[]) {
		int n=arr.length-1;
		int low=0;
		int mid=0;
		int high=n;
		while(mid<high) 
		{
			switch(arr[mid])
			{
			case 0:{
				int temp1=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp1;
				low++;
				mid++;
				break;
			        }
			case 1:{
				low++;
				mid++;
				break;
			}
			case 2:{
				int temp2=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp2;
				high--;
				break;
			}
				   
			}
		}
		for(int val :arr) {
			System.out.print(val+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2, 0, 2, 1, 1, 0};
		System.out.println("sort the data");
		SortArray(arr);
		
	}

}
