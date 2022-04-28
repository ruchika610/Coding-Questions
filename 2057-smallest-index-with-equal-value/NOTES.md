​
class Solution {
    public int smallestEqual(int[] nums) {
        
        boolean check=false; int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%10 == nums[i])
            {
                check =true;
                temp=i;
                break;
            }
        }
        if(check)
        {
            return temp;
        }
        else
        {
            return -1;
        }
    }
}
