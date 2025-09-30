package in.com;

public class ToUpperCaseLatter {
	public static void main(String[] args) {
		String string = "abhishek";
	    StringBuilder sBuilder = new StringBuilder();

	    for (char ch : string.toCharArray())
	    {
	        if (ch >= 'a' && ch <= 'z') {  // only convert lowercase
	            sBuilder.append((char)(ch - 32));
	        } else 
	        {
	            sBuilder.append(ch);
	        }
	    }
	    System.out.println(sBuilder.toString());
		
		
	}
	

}
