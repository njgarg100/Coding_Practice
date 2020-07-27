package Practice;

import java.util.ArrayList;
import java.util.List;

public class MedianofSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3};
		int[] nums2 = {2,4,5};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
	        double res=0.0;
	        int tlen = nums1.length+nums2.length;
	        int pos = (tlen+1)/2;
	        int low = 0;
	        int high = nums1.length;
	        while(low<=high) {
	            //System.out.println(low + " " + high);
	            int x = (low+high)/2;
	            int y = pos - x;
	            int xLeft = x==0?Integer.MIN_VALUE : nums1[x-1];
	            int xRight = x==nums1.length ? Integer.MAX_VALUE : nums1[x];
	            int yLeft = y==0 ? Integer.MIN_VALUE : nums2[y-1];
	            int yRight = y==nums2.length ? Integer.MAX_VALUE : nums2[y];
	            
	            if(xLeft <= yRight && yLeft<= xRight) {
	                if(tlen%2==1) 
	                    res = (double)Math.max(xLeft, yLeft);
	                else
	                    res = (double)(Math.max(xLeft, yLeft) + Math.min(xRight, yRight))/2;
	                break;
	            }
	            else if(xLeft > yRight) 
	                high = x-1;
	            else if(yLeft > xRight) 
	                low = x+1;
	        }
	        
	        return res;
	    }
}
