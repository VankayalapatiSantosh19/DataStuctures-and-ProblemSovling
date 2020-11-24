//problem link:- https://leetcode.com/problems/guess-number-higher-or-lower/description/

package Binary_Search_Thinking;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GessNumber extends GuessGame { //GuessGame is in the problem
    public int guessNumber(int n) {
        int l=1,r=n,picked=0;
        while(l<=r){
            picked=l+(r-l)/2;
            if(guess(picked)==0) 
                return picked;
            else if(guess(picked) == -1)
                r=picked-1;
            else if(guess(picked) == 1)
                l=picked+1;
            
        }
        return picked;
    }
}
class GuessGame{
	public static int guess(int num) {
		
		//-1: The number I picked is lower than your guess (i.e. pick < num).
		//1: The number I picked is higher than your guess (i.e. pick > num).
		//0: The number I picked is equal to your guess (i.e. pick == num).
		return 0; //this line is dummy code.go to the link for the description
	}
}