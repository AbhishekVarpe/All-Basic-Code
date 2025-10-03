package in.com;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static int functionName(int arr[], int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {   // ✅ iterate directly over array elements
			int compliment = k - num;

			if (map.containsKey(compliment)) {
				count += map.get(compliment); // ✅ count pairs
			}

			map.put(num, map.getOrDefault(num, 0) + 1); // ✅ update frequency
		}
		return count;
	}

//	public static void functionName(int arr[], int k) {
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==k) {
//					count ++;
//				}
//			}
//		}
//		System.out.println(count);
//	}
	
	public static void main(String[] args) {
		int arr[] = {1, 5, 7, -1, 5};
		int k = 6;
		functionName(arr, k);
		//System.out.println("Count of pairs = " + count);
	}
}
