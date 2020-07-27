package Practice;

import java.util.ArrayList;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,3,5,6};
		int target = 7;
		int index = searchInsert(nums,target);
		System.out.println(index);
		ArrayList<Integer> s = new ArrayList<Integer>();

	}
	
	public static int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right) {
            int mid = (right+left)/2;
            if(target == nums[mid]) {
                return mid;
            }
            
            else if(target<nums[mid]) {
                right = mid-1;
            }
            else
                left = mid+1;
            
        }
        int res = 0;
        if(left!=0) res = left;
        else if(left==0) res = 0;
        else if(right==nums.length-1) res = left;
        return res;
    }

}
