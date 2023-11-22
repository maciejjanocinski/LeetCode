package soulutions.easy.missingNumber;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for (int num : nums) {
            sum1 += num;
        }

        for (int i = 0; i <= nums.length; i++) {
            sum2 += i;
        }
        return sum2 - sum1;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

}
