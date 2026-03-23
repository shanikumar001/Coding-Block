package CodingWithRaviSir.lect12;
import java.util.Arrays;
import java.util.Scanner;
public class productpeak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int product =1;
        for (int i = 0; i < arr.length; i++) {
            product = product*arr[i];
        }
        int[] arr2 = new int[n];
        for (int j = 0; j < arr.length; j++) {

            arr2[j]=product/arr[j];
        }
        System.out.println(Arrays.toString(arr2));
        sc.close();

    }
    
}
// leetcode 238