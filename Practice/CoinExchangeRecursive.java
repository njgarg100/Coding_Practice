package Practice;

public class CoinExchangeRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = new int[]{2,3,5};
		int sum = 6;
		System.out.println("Number of coins required " + coinExchange(c, c.length, sum));
	}
	
	public static int coinExchange(int[] c, int n, int sum) {
		if(sum==0) return 1;
		else if(sum<0) return 0;
		else if(n<=0 && sum>=1) return 0;
		else {
			return coinExchange(c, n-1, sum) + coinExchange(c, n, sum-c[n-1]);
		}
	}

}
