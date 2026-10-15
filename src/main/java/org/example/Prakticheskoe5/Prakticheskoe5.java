package org.example.Prakticheskoe5;

import java.util.Arrays;

public class Prakticheskoe5 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 3, 5, 6, 9, 11, 24};
        printArray(numbers);
        int[] result = getSubArrayBetween(numbers2, 4, 10);
        printArray(result);
        int[] numbers3 = getCenter(numbers2);
        printArray(numbers3);
        int[] numbers4 = getCenterArrays(numbers);
        printArray(numbers4);
        int[] first = {1, 3, 7, 5};
        int[] second = {8, 4, 2, 4};
        int[] merge = mergeAndSort(first, second);
        printArray(merge);
        int[] mergeArray = mergeAndSort2(first, second);
        printArray(mergeArray);
        int[] arr = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    //Вывод массива в консоль без Arrays
    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    //Взятие части массива
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int from = 0;
        while (from < numbers.length && numbers[from] < start) {
            from++;
        }
        int to = numbers.length - 1;
        while (numbers[to] > end) {
            to--;
        }
        int[] result = new int[to - from + 1];
        for (int i = from; i <= to; i++) {
            result[i - from] = numbers[i];
        }
        return result;
    }

    //Вернуть середину массива
    public static int[] getCenter(int[] numbers) {
        int len = numbers.length;
        int mid = len / 2;
        if (len % 2 == 0) {
            return new int[]{numbers[mid - 1], numbers[mid]};
        } else {
            return new int[]{numbers[mid]};
        }
    }

    public static int[] getCenterArrays(int[] numbers) {
        int len = numbers.length;
        int mid = len / 2;
        int from = (len % 2 == 0) ? mid - 1 : mid;
        int to = mid;
        return Arrays.copyOfRange(numbers, from, to + 1);
    }

    //Слияние и сортировка массивов
    public static int[] mergeAndSort(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            merged[first.length + i] = second[i];
        }
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - 1 - i; j++) {
                if (merged[j] > merged[j + 1]) {

                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
        return merged;
    }

    public static int[] mergeAndSort2(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            merged[first.length + i] = second[i];
        }
        Arrays.sort(merged);
        return merged;
    }

    //Нечетные числа
    public static void printOddNumbers(int[] arr) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                last = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]);
                if (i != last) {
                    System.out.print(",");
                }
            }
        }
    }
}

