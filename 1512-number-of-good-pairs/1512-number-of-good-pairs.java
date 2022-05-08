class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int [] freq = new int[101];
        if(nums.length == 0){
            return 0;
        }

        for(int i = 0; i< nums.length; i++){
             count += freq[nums[i]]++;
         }
          return count;
      /* brute force approach
      int cnt=0,ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
         return cnt;   
         */
    }
}