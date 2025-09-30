package in.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(27);
		list.add(38);
		list.addLast(0);
		list.add(1);
		list.add(3);
		System.out.println("max element"+ Collections.max(list));
		System.out.println("min element"+ Collections.min(list));
		System.out.println("frequency element"+ Collections.frequency(list,1));
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
	}

}
