package main.sorting;

import static main.sorting.Helper.swap;

public class QuickSort {

    private static void quickSort(int[] array,int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;


        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array,leftPointer,rightPointer);

        }

        swap(array,leftPointer,highIndex);

        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);


    }


    public static void main(String[] args) {
        int[] array = {12,432,13,1,334,21};
        quickSort(array,0,array.length-1);

        for (int num :array){
            System.out.println(num);
        }
    }
}
