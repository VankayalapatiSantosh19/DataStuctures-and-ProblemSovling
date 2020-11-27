//problem link:-https://leetcode.com/problems/search-in-rotated-sorted-array/
package Binary_Search_Thinking;
import java.util.*;
public class RotatedArraySearch {
	public int search(int[] a, int t) {
        int l=0,r=a.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]<a[r])
                r=mid;
            else
                l=mid+1;
        }
        int R=l;r=a.length-1;
        while(R<=r){
            int mid=(R+r)/2;
            if(a[mid]==t)
                return mid;
            if(a[mid]<t)
                R=mid+1;
            else
                r=mid-1;
                
        }
        int L=0;r=l;
        while(L<=r){
            int mid=(L+r)/2;
            if(a[mid]==t)
                return mid;
            if(a[mid]<t)
                L=mid+1;
            else
                r=mid-1;
                
        }
        return -1;
        
    }
	

	
}
