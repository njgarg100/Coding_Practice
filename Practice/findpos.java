package Practice;

public class findpos {

	/*
	 * 
	 * Finding position of element k from an infinite array which contains n integer values 
	 * and rest special character
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,2,4,6,8,3,1,4,8,5,43,2,4,7,84,3,21,'$','$','$','$','$','$','$','$','$','$','$','$','$','$','$'};
		int l=0,r=1;
		while(true) {
			if(a[r]!='$') {
				l=r;
				r=r*2;
			}
			else
				break;
		}
		int mid, temp=-1;
		while(l<=r) {
			mid = l+((r-l)/2)-1;
			if(a[mid]!='$') {
				temp = mid;
				l=mid+1;
			}
			else
				r=mid-1;
		}
		int res = binarySearch(a, 0,temp,7);
		System.out.println("Position of 7 is: " + res);
	}

	private static int binarySearch(int[] a, int l, int r, int k) {
		// TODO Auto-generated method stub
		int mid=-1;
		if(l<=r) {
			mid=l+(r-l)/2;
			if(a[mid]==k) {
				return mid;
			}
			if(a[mid]>k) {
				mid = binarySearch(a, l, mid-1, k);
			}
			else
				mid = binarySearch(a, mid+1, r, k);
		}
		return mid;
	}

}
