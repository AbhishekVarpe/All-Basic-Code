package in.com;

public class Sort012 {
	
	public static void SortData(int a[]) {
		int low=0;
		int mid=0;
		int high=a.length-1;
		while(mid<=high) {
			if(a[mid]==0) {
				int temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
			}else if (a[mid]==1) {
				mid++;
			}else if (a[mid]==2) {
				int temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
				
			}
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,0,0,0,2,1,1,2,2,2,2,2,2,1,1,1,1,1,1,1,0,0,0,0,0,2,1};
		SortData(a);
		

	}

}
