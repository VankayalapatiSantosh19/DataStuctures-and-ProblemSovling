// Problem Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package Adhoc_Thinking;
import java.util.*;
public class Remove_Duplicates_from_Sorted_Array {
	 public static int removeDuplicates(int[] nums) {
		 int x=0,y=1;
	     for(;y<nums.length;y++)
	    	 if(nums[x]!=nums[y]){
	    		 nums[x+1]=nums[y];
	             x++;
	         }
	     return x+1;
	 }
	 public static void main(String[] args) {
		 int[] nums = {0,0,1,1,1,2,2,3,3,4};
		 int x=removeDuplicates(nums);
		 for(int i=0;i<x;i++)
			 System.out.print(nums[i]);
		

	}

}
