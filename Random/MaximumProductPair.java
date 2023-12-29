/*

Given an integer array, find a pair with the maximum product in it.

Each input can have multiple solutions. The output should match with either one of them.

Input : [-10, -3, 5, 6, -2]
Output: (-10, -3) or (-3, -10) or (5, 6) or (6, 5)

Input : [-4, 3, 2, 7, -5]
Output: (3, 7) or (7, 3)

If no pair exists, the solution should return null.

Input : [1]
Output: null

*/

class MaximumProductPair {
	/*
	 * The Pair<U, V> class have
	 * 1. Two member variables, first and second.
	 * 2. Factory method `Pair.of(U, V)` for creating its immutable instance.
	 * 3. equals() and hashCode() methods overridden.
	 */

	public static Pair<Integer, Integer> findPair(int[] nums) {
		Pair pair = null;

		int maximumNegative = 0;
		int secondMaximumNegative = 0;
		int maximumPositive = -1;
		int secondMaximumPositive = -1;

		if (nums.length <= 1)
			return null;
		else if (nums.length == 2)
			return Pair.of(nums[0], nums[1]);
		else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= 0) {
					if (nums[i] > maximumPositive) {
						secondMaximumPositive = maximumPositive;
						maximumPositive = nums[i];
					} else if (nums[i] > secondMaximumPositive) {
						secondMaximumPositive = nums[i];
					}
				} else {
					if (nums[i] < maximumNegative) {
						secondMaximumNegative = maximumNegative;
						maximumNegative = nums[i];
					} else if (nums[i] < secondMaximumNegative) {
						secondMaximumNegative = nums[i];
					}
				}
			}
			if (maximumNegative * secondMaximumNegative > maximumPositive * secondMaximumPositive)
				pair = Pair.of(maximumNegative, secondMaximumNegative);
			else
				pair = Pair.of(maximumPositive, secondMaximumPositive);
			// Arrays.sort(nums);
			// int n = nums.length - 1;
			// if(nums[n]*nums[n-1] > nums[0]*nums[1])
			// pair = Pair.of(nums[n], nums[n-1]);
			// else pair = Pair.of(nums[0], nums[1]);

		}
		return pair;
	}
}