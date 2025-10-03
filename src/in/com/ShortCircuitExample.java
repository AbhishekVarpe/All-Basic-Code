package in.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortCircuitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean data=Arrays.asList(1,2,3,4,5,6,7,8,9).stream().anyMatch(n->n > 3);
		
		Optional<Integer> no=Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter(n->n>=2).findFirst();
		System.out.println(data);
		
		 List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6)
	                .stream()
	                .limit(3)   // take only first 3 elements
	                .toList();
		 System.out.println(result);
	}

}
