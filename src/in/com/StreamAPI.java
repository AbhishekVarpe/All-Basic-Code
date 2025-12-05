package in.com;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   List<Integer> list=new ArrayList<Integer>();
   list.add(10);
   list.add(20);
   list.add(7);
   list.add(98);
   list.add(57);
   for(Integer i:list)
   {
	   if(i%2==0)
	   {
		   System.out.println("even"+ " "+i);
	   }
	   else
	   {
		   System.out.println("odd"+" "+i);
	   }
     }
   
	}
	

}
