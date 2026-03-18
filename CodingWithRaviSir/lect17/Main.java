package CodingWithRaviSir.lect17;

public class Main {
    // Single Number : 
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            ans = ans ^ nums[i];
        
        }
        return ans;
    }

    //
}
