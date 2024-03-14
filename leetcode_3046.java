package Arrays;

public class leetcode_3046 {

	public static void main(String[] args) {
		int[] nums= {1,1,2,2,3,4};
		isPossibleToSplit(nums);

	}
	 public static boolean isPossibleToSplit(int[] nums) {
		  int[] count = new int[101];
	        for (int x : nums) {
	            count[x]++;
	            if (count[x] > 2) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
