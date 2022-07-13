public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        // use int k to specify v
        int k = 0,pre_sum = 0,current_sum =nums[0], max = current_sum;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > current_sum && current_sum < 0) current_sum = nums[i];
            else if(nums[i] + current_sum >= 0) current_sum = current_sum+nums[i];
            else{ if(++i < nums.length) current_sum = nums[i];}
            max = Math.max(current_sum, max);
        }
        return max;
    }
}
