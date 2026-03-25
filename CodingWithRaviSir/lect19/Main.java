package CodingWithRaviSir.lect19;

import java.util.Arrays;

public class Main {
    public static void palyGame() {
        int arr[] = { 4, 1, 2, 10 };
        int n = 4;
        int turn = 1;
        int left = 0;
        int right = 0;
        int a = 0;
        int b = 0;
        while (left < right) {
            if (turn == 1) {
                if (arr[left] > arr[right]) {
                    a += arr[left];
                    left++;
                } else {
                    a += arr[right];
                    right--;
                }
                turn = 0;
            } else {
                if (arr[left] > arr[right]) {
                    b += arr[left];
                    left++;
                } else {
                    b += arr[right];
                    right--;
                }
                turn = 1;
            }
        }
        System.out.println(a + " " + b);
    }

    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(g[i] <= s[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        palyGame();
    }
}
