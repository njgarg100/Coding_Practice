package Practice;

public class StringToInteger {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   +0 123";
		System.out.println(myAtoi(s));
	}
	
    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0) return 0;
        int dig=0;
        int i=0;
        int sign=1;
        if(str.charAt(0)=='-' || str.charAt(0)=='+') {
            sign = str.charAt(0)=='-' ?-1:1;
            str = str.substring(1);
        }
        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                
                if (dig > Integer.MAX_VALUE / 10 || (dig == Integer.MAX_VALUE / 10 && (ch-'0') > Integer.MAX_VALUE % 10))
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                
                dig = (dig*10) + (ch-'0');
            }
            else {
                break;
            }
                
        }
        return dig*sign;
    }

}
