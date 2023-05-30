package Assainment_1;
public class code2 {
	static int removelements(int[] nums ,int val ) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=val)
				count++;
		}
		return count;
		
	}
		public static void 	main(String[] args) {
			 int[] nums = {2, 3, 4, 3, 2};
		     int val = 3;
		     System.out.println(removelements(nums, val));
			}
}
	