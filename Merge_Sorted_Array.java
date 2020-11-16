//problem Link:- https://leetcode.com/problems/merge-sorted-array/ 
package Adhoc_Thinking;
import java.util.*;
public class Merge_Sorted_Array {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int j=0,i=m;
                while(i<nums1.length){
                    nums1[i]=nums2[j];
                    i++;
                    j++;
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }

	public static void main(String[] args) {
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		merge(nums1,3,nums2,3);

	}

}
