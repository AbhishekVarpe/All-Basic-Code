package in.com;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=54;
		int b=24;
		int temp=0;
		while(a>0) {
			temp=a;
			a=a%b;
			b=temp;
		}
		System.out.println(b);

	}

}
