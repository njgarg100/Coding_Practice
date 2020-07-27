package Practice;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend=-2147483648, divisor=-1;
		boolean factor = true, num = true;
        if(divisor<0){
            factor = false;
            divisor = (-1)*divisor;
        } 
        if(dividend<0) {
            num = false;
            if(dividend==Integer.MIN_VALUE) dividend = Integer.MAX_VALUE;
            else dividend = (-1)*dividend;
        } 
        int temp = dividend;
        int i = 0;
        while(true) {
            if(temp-divisor<0) break;
            temp = temp - divisor;
            i++;
        }
        if(factor!=num) i=(-1)*i;
        if(i>Integer.MAX_VALUE) i=Integer.MAX_VALUE;
        if(i<Integer.MIN_VALUE) i=Integer.MIN_VALUE;
        System.out.println(i);
	}

}
