package main.arrays101;

import static main.sorting.Helper.printArray;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        boolean isSorted = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    isSorted = true;
                }
            }

            if (!isSorted) {
                break;
            }4
        }
        return nums;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 5, 3};
        printArray(sortedSquares(array));

    }
}
