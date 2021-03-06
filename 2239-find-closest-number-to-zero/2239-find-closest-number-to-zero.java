class Solution {
    public int findClosestNumber(int[] nums) {
         int ans = Integer.MIN_VALUE;
        int closest = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);
            
            if (distance < closest) {
                closest = distance;
                ans = nums[i];
            }
            
            else if (distance == closest && nums[i] > ans)
                ans = nums[i];
        }
        
        return ans;
    }
}