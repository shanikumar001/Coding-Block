package leetcode;

import java.util.Arrays;

public class Array {
    //01 : Two Sum : 
    public static void twoSum(){
        int arr[] = {2,7,11,15};
        int target = 9;
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    
    // 26. Remove Duplicates from Sorted Array : 
    public static void removeDuplicates(){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        int k = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    // 283. Moves Zeros : 
    public static void moveZeroes() {
    int arr[] = {0,0,1,0,3,12};
    int n = arr.length;

    int j = 0; // position for non-zero

    for(int i = 0; i < n; i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }

    for(int a : arr){
        System.out.print(a + " ");
    }
}


    // 1920 : Array from Permutation : 
    public int[] buildArray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int arr[] = new int[n];
        while(i < n){
            arr[i] = nums[nums[i]];
            i++;
        }
        return arr;
    }

    // 1929 : Concatenation of Array :
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        int i = 0;
        while(i < 2*n){
            if(i < n){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i-n];
            }
        }
        return ans;
    }
    
    // 16 : 3 Sum Closest : 
    public static int threeSumClosest(){
        int arr[] = {0,0,0};
        int target = 1;
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2];
        int i = 0;
        while(i < n-2){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(Math.abs(sum-target) < Math.abs(closestSum-target)){
                    closestSum = sum;
                }
                if(sum < target){
                    left++;
                }else{
                    right++;
                }
            }
            i++;
        }
        return closestSum;
    }

    // Sum of Tiplates equal to target in array : 
    public static void triplates(){
        int arr[] = {5, 7, 9, 1, 2, 4, 6, 8, 3};
        int target = 10;
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        
        while(i < n){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    left++;
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
            i++;
        }
    }

    // 42 : Trapping Rain Water : 
    public static int trap() {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;
        int result = 0;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > leftMax){
                    leftMax = height[left];
                }else{
                    result += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] > rightMax){
                    rightMax = height[right];
                }else{
                    result += rightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }

    // 189 : Rotate array by K times (right rotation)
    public static void rotate(int arr[],int left, int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateArrayByKtimes(){
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        rotate(arr, 0, n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    // 53. Maximu Subarray sum : 
    public static void maxSum(){
        int arr[] = {2,3,-2,4};
        int n = arr.length;
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i = 0; i < n; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) currentSum = 0;
        }
        System.out.println(maxSum);
    }
    
    // 152. Maximum Product Subarray : 
    public static void maxProduct() {
        int arr[] = {2,3,-2,4};
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;
        int leftMax = 1;
        int rightMax = 1;
        for(int i = 0; i < n; i++){
            leftMax *= arr[i];
            rightMax *= arr[n-i-1];
            int product = Math.max(rightMax, leftMax);
            maxProduct = Math.max(maxProduct, product);
            if(leftMax == 0) leftMax = 1;
            if(rightMax == 0) rightMax = 1;
        }
        System.out.println(maxProduct + " ");
        
    }

    // Inverse Array : 
    static void recursionInverse(int arr, int n){
        
    }
    // public static void inverse(){
    //     int arr[] = {0, 2, 4, 1, 3};
    //     int n = arr.length;
    //     int nums[] = new int[n];
        

    // }

    public static void main(String[] args) {
        // triplates();
        // System.out.println(trap());
        // rotateArrayByKtimes();
        // maxSum();
        // twoSum();
        // removeDuplicates();
        moveZeroes();
    }
}
