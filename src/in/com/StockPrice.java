package in.com;

public class StockPrice {
	public static int stockprice(int prices[])
	{
		int buyprice=Integer.MIN_VALUE;
		int profit=0;
		int maxprofit=0;
		for(int i=0;i<prices.length;i++)
		{
			if(buyprice<prices[i]) 
			{
				profit=prices[i]-buyprice;
				maxprofit=Math.max(prices[i], maxprofit);
			}
		}
		return maxprofit;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int prices[]={7, 1, 5, 3, 6, 4};
		int result=stockprice(prices);
		System.out.println("max profit is"+result);

	}

}
