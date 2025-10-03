package in.com;

public class LinearSearch {
	public static int LinearSearch(int []arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return-1;
//		int n=arr.length;
//		
//		int low=0;
//		int high=n-1;
//		while(low<high) {
//			int mid=low+(high-low)/2;
//			
//			if(arr[mid]==key) {
//				return mid;
//			}
//			else if (arr[mid]<key) {
//			 low=mid+1;
//			}else {
//				mid=high-1;
//			}		}
//		
//		return -1;
//		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,54,3,6,556,798,55,77,54,0};
		
		int key=0;
		
		int result=LinearSearch(arr, key);
		if(result==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found");
		}

	}

}
