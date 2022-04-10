package main.sorting;


import static main.sorting.Helper.printArray;
import static main.sorting.Helper.swap;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 2, 5, 2,-5,98};
        printArray(bubbleSort(array));
    }
}
