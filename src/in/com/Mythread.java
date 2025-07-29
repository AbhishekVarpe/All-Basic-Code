package in.com;
class demo extends Thread{
	public void run() {
		System.out.println("i am in thread");
	}
	
}
public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo demo=new demo();
		demo.start();

	}

}
