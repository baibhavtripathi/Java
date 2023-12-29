/*

Given a binary array, in-place sort it in linear time and constant space. The output should contain all zeroes, followed by all ones.

Input : [1, 0, 1, 0, 1, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 1, 1]

Input : [1, 1]
Output: [1, 1]

*/

class Solution
{
	public static void sortArray(int[] nums)
	{
		int i = 0;
		int j = nums.length-1;
		while( i < nums.length && nums[i] == 0 ) i++;
		while( j >= 0 && nums[j] == 1 ) j--;
		while( i < j ) {
			if( nums[i] == 1 && nums[j] == 0 ) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
			i++;
			j--;
		}
	}
}
