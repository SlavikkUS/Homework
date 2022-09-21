package Task13;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        getPositiveAndNegativeNumbersOfArray(createNewArray());
        fillNewArrayPrimeNumbers(createNewArray());
    }

    private static int[] createNewArray() {
        int[] arrayFirst = new int[100_002];
        for (int i = 100_001; i > 0; i--) {
            arrayFirst[i - 1] = i - 1;
        }
        int[] arraySecond = new int[100_001];
        for (int i = 0; i <= 100_000; i++) {
            arraySecond[i] = arrayFirst[i] * -1;
        }
        return (joinArray(arrayFirst, arraySecond));

    }

    private static int[] joinArray(int[] arrayFirst, int[] arraySecond) {
        int[] result = Arrays.copyOf(arrayFirst, arrayFirst.length + arraySecond.length);
        System.arraycopy(arraySecond, 0, result, arrayFirst.length, arraySecond.length);

        return result;
    }

    private static void getPositiveAndNegativeNumbersOfArray(int[] result) {
        int[] arrayPositiveNumbers = new int[100_000];
        int[] arrayNegativeNumbers = new int[100_000];
        int amountPositiveNumbers = 0;
        int amountNegativeNumbers = 0;
        for (int i:result) {
            if (i > 0) {
                arrayPositiveNumbers[amountPositiveNumbers] = i;
                amountPositiveNumbers++;
            }
            if (i < 0) {
                arrayNegativeNumbers[amountNegativeNumbers] = i;
                amountNegativeNumbers++;
            }
        }
        System.out.println(Arrays.toString(arrayPositiveNumbers));
        System.out.println(Arrays.toString(arrayNegativeNumbers));


    }


    private static void fillNewArrayPrimeNumbers(int[] array) {
        for (int i = 2; i < array.length / 2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < array[i]; j++) {

                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                int[] arrayPrime = Arrays.copyOf(array, 100_000);

                System.out.print(arrayPrime[i] + " ");
            }
        }
    }
}




