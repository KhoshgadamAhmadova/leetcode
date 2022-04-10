package main.arrays101;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int maxConsecutiveCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                consecutiveCount++;
                System.out.println("consecutive count: " + consecutiveCount);
            } else {
                consecutiveCount = 0;
            }

            maxConsecutiveCount = consecutiveCount > maxConsecutiveCount ? consecutiveCount : maxConsecutiveCount;

            System.out.println("maxconsecutive count: " + maxConsecutiveCount);
        }

        return maxConsecutiveCount;
    }

    public static int findMaxConsecutiveOnes_Sol2(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count = 0;
                continue;
            }
            count++;
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    ;
}


