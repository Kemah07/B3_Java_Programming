package day21_arrays;

import java.util.Arrays;

/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */
public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        int [] reversed = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            reversed[reversed.length-1 - i] = arr[i]; // 4 - 0  | 4 - 1 | 4 - 2 | 4 - 3 | 4 - 4
            //because the arr.length -1 is not dynamic,  it looped through the entire array reassigning reversed last index with each i until it reached the last i --> 5
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed));



    }
}
