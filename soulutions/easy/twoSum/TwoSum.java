package soulutions.easy.twoSum;

import java.util.Arrays;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (target - nums[i] == nums[j] && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 3, 7, 15};
        System.out.println(Arrays.toString(twoSum.solution(nums, 9)));
    }

}
