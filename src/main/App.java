package main;

import java.util.Arrays;
import main.problems.TwoSum1;

public class App {
    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        System.out.println(Arrays.toString(twoSum1.twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum1.twoSum_hashMap(nums, target)));
    }
}
