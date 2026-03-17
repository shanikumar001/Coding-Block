package CodingWithRaviSir.lect09;

import java.util.*;

public class Main {

    // Find Target value :
    public static void findTarget(int target, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("terget value is on : " + i);
            }
        }
    }

    // Find Max value :
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
            return max;
        }
        return max;
    }

    // Find Min value :
    public static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
            return min;
        }
        return min;
    }

    // Swipe two variable :
    public static void swipe(int a, int b) {
        System.out.println(" a = " + a + " b = " + b);
        //using third variable : 
        // int temp = a;
        // a = b;
        // b = temp;

        // using arthematic operator : 
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // Bitwise operator : 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(" a = " + a + " b = " + b);
    }

    // reverse an array :
    public static void reverse(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            arr[i] = arr[n-i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Add data to Array :
    public static void addDataArray(int arr[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Print Array :
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void leftShiftReverse(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int last = arr[n - 1 - i];

            // Shift elements to the right
            for (int j = n - 1 - i; j > i; j--) {
                arr[j] = arr[j - 1];
            }

            arr[i] = last;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 8, 16 };
        // printArray(arr);
        // findTarget(5, arr);
        // System.out.println(findMax(arr));
        // System.out.println(findMin(arr));
        // swipe(8, 16);
        reverse(arr);
    }
}
