package in.com;

public class TrapRainWater
{
	public static int trap(int n[]) 
	{
		int z=n.length;
		int leftmax[]=new int[z];
		int rightmax[]=new int[z];
		int water =0;
		//fill left side;
		
		leftmax[0]=n[0];
		for(int i = 1; i < n.length; i++)
		{
			leftmax[i]=Math.max(leftmax[i-1], n[i]);
		}
		//fill right side
		rightmax[z-1]=n[z-1];
		for(int i=z-2;i>=0;i--) {
			rightmax[i]=Math.max(rightmax[i+1], n[i]);
		}
		for(int i = 0; i <n.length;i++){
			water+=Math.min(leftmax[i],rightmax[i])-n[i];
		}
		return water;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n[]= {4, 2, 0, 3, 2, 5};
		int result=trap(n);
		System.out.println(result);

    }
}
