class Solution {
    public int maxSubArray(int[] nums) {
        int sumTillNow = 0;
        int ans = nums[0];
        for(int i:nums){
            sumTillNow=Math.max(sumTillNow+i, i);
            ans = Math.max(sumTillNow, ans);
        }
        return ans;
    }
}
