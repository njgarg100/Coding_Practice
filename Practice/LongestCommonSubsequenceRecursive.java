package Practice;

import java.util.Arrays;
import java.util.LinkedList;

public class LongestCommonSubsequenceRecursive {
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		System.out.println("Length of Longest Common Subsequence " + lcs(ch1, ch2, s1.length(), s2.length()));
	}
	
	public static int lcs(char ch1[], char ch2[], int m, int n) {
		if(m==0 || n==0) return 0;
		if(ch1[m-1]==ch2[n-1])
			return 1+lcs(ch1, ch2, m-1, n-1);
		
		else
			return Math.max(lcs(ch1, ch2, m-1, n), lcs(ch1, ch2, m, n-1));
	}
}
