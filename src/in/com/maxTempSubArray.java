package in.com;

public class maxTempSubArray {
	
	public static void maxTempSubArray1(int arr[],int k) {
		
		for(int i=0;i<=arr.length-k;i++) {
			int max=arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) {
					max=arr[i+j];
				}
			}
			System.out.println(max);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []temp= {30,25,28,32,31,29,35};
		int key=3;

		maxTempSubArray1(temp, key);
	}

}
