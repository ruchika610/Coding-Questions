class Solution {
    public int singleNumber(int[] nums) {
        int ans=0,cnt=0;
        for(int i=0;i<32;i++){
            //check set bit for each postion
            cnt=0;
            for(int j=0;j<nums.length;j++){
                if(checkbit(nums[j],i)){
                    cnt++;
                }
            }
            if(cnt % 3 != 0){
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
    public boolean checkbit(int n, int pos){
        if(((n >> pos) & 1) == 1){
            return true;
        }
        return false;
    }
}