package in.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class StringCompress {
	public static void CompressString(String s) {
		HashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		String result="";
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			result+=entry.getKey().toString() +entry.getValue();
			
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabcccde";
		CompressString(str);
		

	}

}
