package in.com;

public class MultiThreding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}

	}

}
