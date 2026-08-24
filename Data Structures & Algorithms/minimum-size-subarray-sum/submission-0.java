class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int high = 0; high < nums.length; high++){
            sum = sum + nums[high];
            while(sum >= target){
                int len = high - low + 1;
                ans = Math.min(ans, len);
                sum = sum - nums[low];
                low++;
            }
        }
         return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}