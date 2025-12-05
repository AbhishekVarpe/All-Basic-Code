package in.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonReaptingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="abhisheka";
		
		Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(char ch:string.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:map.keySet()) {
			if (map.get(ch)==1) {
				System.out.print(ch);
				System.exit(0);
				
			}
		}

	}

}
