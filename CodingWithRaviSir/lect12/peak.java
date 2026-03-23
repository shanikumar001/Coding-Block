package CodingWithRaviSir.lect12;
import java.util.Scanner;
public class peak {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("enter elements ");
        int []arr= new int[n];
        for (int i =0;i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int result=index(arr);
        System.out.println("result " +result);
        sc.close();

    }
    static int index(int[] arr){
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    
}
