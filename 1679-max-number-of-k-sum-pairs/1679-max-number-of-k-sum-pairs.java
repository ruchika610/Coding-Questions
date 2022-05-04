class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=0,sum=0,left=0,right=nums.length-1;
        
        while(left<right)
        {
            sum=nums[left]+nums[right];
            if(sum==k)
            {
                right--;
                left++;
                cnt++;
            }
            else if(sum>k)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return cnt;
    }
}