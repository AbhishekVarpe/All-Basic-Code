package in.com;

public class MissingNumberOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,4,5};
		int n=5;
		int sum= n*(n+1)/2;
		int sumArr=0;
		for(int i:arr) {
			sumArr+=i;
		}
		int missing=sum-sumArr;
		System.out.println(missing);
	}

}
