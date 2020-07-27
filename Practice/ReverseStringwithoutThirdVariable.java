package Practice;

public class ReverseStringwithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Sparta";
		int len = s.length();
		//System.out.println(s.substring(1));
		int start = 0;
		int end = len-1;
		char sb[] = s.toCharArray();
		while(start<end) {
			sb[start] ^= sb[end];
			sb[end] ^= sb[start];
			sb[start] ^= sb[end];
			start++;
			end--;
		}
		System.out.println(String.valueOf(sb));
		

	}

}
