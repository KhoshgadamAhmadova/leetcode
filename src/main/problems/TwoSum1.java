package main.problems;

import java.util.HashMap;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }

        }
        return indices;
    }

    public int[] twoSum_hashMap(int[] nums, int target) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                return new int[] {i, numbers.get(target - nums[i])};
            } else {
                numbers.put(nums[i], i);
            }
        }
        return new int[] {};

    }
}


