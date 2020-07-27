package Practice;

import java.util.Arrays;

public class LongestCommonSubsequenceDPTopDownMemoization {
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		dp = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				dp[i][j]=-1;
			}
		}
		//Arrays.fill(dp, -1);
		int res = lcs(ch1, ch2, s1.length(), s2.length());
		System.out.println("Length of Longest Common Subsequence " + res);
	}
	
	public static int lcs(char[] ch1, char[] ch2, int m, int n) {
		if(m==0 || n==0) {
			return 0;
		}
		
		if(dp[m-1][n-1]!=-1) {
			return dp[m-1][n-1];
		}
		
		if(ch1[m-1]==ch2[n-1]) {
			dp[m-1][n-1]=1+lcs(ch1, ch2, m-1, n-1);
			return dp[m-1][n-1];
		}
		
		else {
			dp[m-1][n-1] = Math.max(lcs(ch1, ch2, m-1, n), lcs(ch1, ch2, m, n-1));
			return dp[m-1][n-1];
		}
	}

}
