package main.arrays101;

import main.sorting.Helper;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i< arr.length;i++){
            if (arr[i] == 0) {
                for(int j = arr.length-2; j >= i;j--){
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
    }

    public static  void duplicateZeros_LeetCodeVersion(int[] arr) {
        int cnt = 0;
        for (int n : arr) {
            if (n == 0) cnt++;
        }
        for (int i = arr.length - 1, j = arr.length + cnt - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i] == 0) {
                if (j < arr.length) arr[j] = arr[i];
                j--;
            }
            if (j < arr.length) arr[j] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        duplicateZeros(array);
        Helper.printArray(array);
    }
}
