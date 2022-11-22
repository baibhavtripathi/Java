public class BinarySearchImplJava {
    public static void main(String[] args) {
        System.out.println(findIndexIterative(new int[] {-4, -4, -4, -2, 0, 1, 3}, -4));
    }
    public static int findIndexIterative(int[] nums, int target)
	{
		int low = 0, high = nums.length-1, mid = 0;
		while(low<=high) {
            mid = (low+high)/2;
			if(nums[mid] == target)	return mid;
			else if( nums[mid] < target )	{
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static int findIndexRecursively(int[] nums, int target)
	{
		int low = 0, high = nums.length-1, mid = 0;
		while(low<=high) {
            mid = (low+high)/2;
			if(nums[mid] == target)	return mid;
			else if( nums[mid] < target )	{
				low = mid + 1; 
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}