package Practice;

public class RemoveAdjPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "CAAABBBAACDDDD";
		char[] ch = st.toCharArray();
		int len = ch.length;
		int j=0;
		int i=1;
		for(;i<len;i++) {
			while((i<len) && (j>=0) && (ch[i] == ch[j])) {
				i++;
				j--;
			}
			if(i<len) {
				ch[++j] = ch[i];
			}
			
		}
		
		System.out.println(String.valueOf(ch).substring(0,j+1));
	}

}
