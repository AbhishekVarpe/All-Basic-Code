package in.com;

import java.util.Arrays;

public class EvenANDodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		long even = Arrays.stream(arr).filter(x->x%2==0).count();
		long odd = arr.length - even;
		System.out.println("Even="+even+" Odd="+odd);


		int a[]= {897,9768,75,809,346,6,56};
		long e=Arrays.stream(arr).filter(x->x%2==0).count();
		long o=a.length-e;
		System.out.println("even ="+e+ " and"+ " "+"odd="+o);
	}

}
