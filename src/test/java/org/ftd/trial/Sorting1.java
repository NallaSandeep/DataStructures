package org.ftd.trial;

public class Sorting1 {

    public static void main(String[] args) {
        int[] array = {3, 10, 1, 21, 2};
        System.out.println("Before Sorting:");
        printArray(array);
        System.out.println("After Sorting:");
        printArray(sort(array));
    }
    
    public static int[] sort(int[] array) {
        int size = array.length;
        for(int i = 0; i < (size-1); i++) {
            for(int j = i; j < size; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    
    public static void printArray(int[] array) {
        for(int a: array) {
            System.out.println(a);
        }
    }
}