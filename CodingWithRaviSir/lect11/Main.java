package CodingWithRaviSir.lect11;

import java.util.Scanner;

public class Main {
    // 01 : Bubble Sort
    // 02 : Selection Sort
    // 03 : Insertion Sort

    // 01 : Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int min = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

        System.out.print("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}