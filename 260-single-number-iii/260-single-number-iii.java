class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int xor=0,pos=0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        for(int i=0;i<32;i++){
            if(((xor >> i) & 1)==1){
                pos=i;
                break;
            }
        }
        int num1 = 0,num2 = 0;
        for(int i=0;i<nums.length;i++){
            if(checkbit(nums[i],pos)){
                num1 = num1 ^ nums[i];
            }
            else{
                num2 = num2 ^ nums[i];
            }
        }
        ans[0]=num1;
        ans[1]=num2;
        return ans;
    }
    public boolean checkbit(int n,int pos){
        if(((n >> pos) & 1) == 1){
            return true;
        }
        return false;
    }
}