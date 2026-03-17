package CodingWithRaviSir.lect12;
class missing{
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int total = n*(n+1)/2;
        int arraysum = 0;
        for(int i = 0; i<nums.length;i++){
            arraysum=arraysum+nums[i];
        }
        int output = total-arraysum;
        return output;
    }
}//leetcode 268