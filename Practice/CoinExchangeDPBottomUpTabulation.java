package Practice;

public class CoinExchangeDPBottomUpTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = new int[]{2,3,5};
		int sum = 6;
		int dp[] = new int[sum+1];
		dp[0]=1;
		for(int i=0;i<c.length;i++) {
			for(int j=c[i];j<=sum;j++) {
				dp[j]=dp[j] + dp[j-c[i]];
			}
		}
		
		System.out.println("Total coins required " + dp[sum]);
	}

}
