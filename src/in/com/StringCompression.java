package in.com;

public class StringCompression {
	public static String compressString(String s) {
		
		int count=0;
		char prev=s.charAt(0);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==prev) {
				count++;
			}
			else {
				sb.append(prev).append(count);
				prev=ch;
				count=1;
			}
		}
		sb.append(prev).append(count);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(compressString("aaabbc"));

	}

}
