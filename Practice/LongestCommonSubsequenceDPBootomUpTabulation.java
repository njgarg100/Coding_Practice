package Practice;

import java.util.Arrays;

public class LongestCommonSubsequenceDPBootomUpTabulation {
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		dp = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length();i++) {
			Arrays.fill(dp[i],-1);
		}
		
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				if(i==0||j==0) dp[i][j]=0;
				else if(ch1[i-1]==ch2[j-1])
					dp[i][j]=dp[i-1][j-1]+1;
				else 
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		} 
		
		System.out.println("Length of Longest Common Subsequence " + dp[s1.length()][s2.length()]);
	}

}
