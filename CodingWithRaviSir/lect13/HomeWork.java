import java.util.Arrays;

public class HomeWork {
    // 217. Contains Duplicate :
    // Method 1 : Brute Force, Time Complexity = O(n*n)
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    // Method 2 : Using Sort, Time Complexity = O(n)
    public static boolean containsDuplicate2(int[] nums) {
        boolean result = false;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                result = true;
                break;
            }
        }
        return result;
    }


    // 628 : maximum product of three number : 
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(option1, option2);
    }


    // 75. Sort Color : 
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int r = 0, w = 0, b = 0;
        for(int i : nums){
            if(i == 0){
                r++;
            }else if(i == 1){
                w++;
            }else if(i == 2){
                b++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i <= r-1){
                nums[i] = 0;
            }else if(r <= i && i <= w+r-1){
                nums[i] = 1;
            }else if((w+r) <= i && i <= (b+w+r-1)){
                nums[i] = 2;
            }
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        System.out.println(maximumProduct(nums));
        sortColors(nums);
        // Arrays.sort(nums);
        // for(int i : nums){
        //     System.out.println(i);
        // }
    }
}
