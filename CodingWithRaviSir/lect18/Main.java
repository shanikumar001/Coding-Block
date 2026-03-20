package CodingWithRaviSir.lect18;

import java.util.*;

public class Main {

    // Reverse array (helper)
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array by K times (right rotation)
    public static void rotateArrayByKtimes(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("Rotated Array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Subarray printing
    public static void subArray(int arr[]){
        System.out.println("Subarrays:");
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Trapping Rain Water
    public static void trapingWater(int arr[]) {
        int n = arr.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int water = 0;
        for(int i = 0; i < n; i++){
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        System.out.println("Trapped Water: " + water);
    }

    // Left Shift by K
    public static void leftShift(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("Left Shifted Array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Subarray Sum (print all sums)
    public static void subArraySum(int arr[]){
        System.out.println("Subarray Sums:");
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                System.out.println(i + " , " + j +  " , = " + sum);
            }
        }
    }

    // Product of array except it self : 
    public static void productArray(int arr[]){
        int totalProduct = 1;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            totalProduct *= arr[i];
        }
        int prdct[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            prdct[i] = totalProduct / arr[i];
        }
        System.out.println(totalProduct);
        for(int i : prdct){
            System.out.print(i + " ");
        }
    }

    // Main
    public static void main(String[] args) {

        int arr[] = {3, 3, -5, 2, -1, 4};

        // trapingWater(arr);

        // int arr2[] = {1, 2, 3, 4, 5};
        // rotateArrayByKtimes(arr2, 2);

        // int arr3[] = {1, 2, 3};
        subArray(arr);

        // int arr4[] = {1, 2, 3, 4, 5};
        // leftShift(arr4, 2);

        // int arr5[] = {1, 2, 3};
        // subArraySum(arr5);

        // productArray(arr);
    }
}