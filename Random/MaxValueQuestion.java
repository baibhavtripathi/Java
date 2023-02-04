import java.util.*;

public class MaxValueQuestion {
    public static void main(String[] args) {
        System.out.println(subsets(new int[] {0,4,6,8}, 2));
    }
    public static Integer subsets(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0, k);
        Integer maxValue = -1;
        for (Integer num : list) {
            if (num % 3 == 0 && num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    
    private static void backtrack(List<Integer> list , List<Integer> tempList, int [] nums, int start, int k){
        if( tempList.size() == k ) {
            String temp = "";
            for (int i : tempList) {
                temp += i;
            }
            list.add(Integer.valueOf(temp));
        }
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}
