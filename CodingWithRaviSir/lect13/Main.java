public class Main {
    // leetcode maxi mum subarray : 
    // 02 : content duplicate
    // 03 : maximum of three number
    // 04 : sort color
    // 05 : Rapid reed
    public static int maxSubarray(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i : arr){
            cs += i;
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }
        }
        return cs;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubarray(arr);
        System.out.println(result);
    }
}
