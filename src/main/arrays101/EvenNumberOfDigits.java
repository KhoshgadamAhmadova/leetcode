package main.arrays101;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {

        int digitsCount = 0;
        int evenNumberDigitsCount = 0;

        for (int num: nums) {

            digitsCount = 0;

            while (num > 0){
                num /= 10;
                digitsCount++;
            }

            if(digitsCount %2 == 0){
                evenNumberDigitsCount++;
            }
        }
        return evenNumberDigitsCount;
    }

    public static void main(String[] args) {
        int[] numbers = {123,543,1243,123456,1,12,4242};
        System.out.println(findNumbers(numbers));
    }
}
