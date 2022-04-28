class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE,len=0; boolean check=false;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>=target)
                {
                    check=true;
                    len=j-i+1;
                    min=Math.min(min,len);
                }
            }
        }
        if(check)
        {
            return min;
        }
        return 0;
       /* //build ps
        int[] ps=new int[nums.length];
        ps[0]=nums[0];
        for(int i=1;i<ps.length;i++)
        {
            ps[i]=ps[i-1]+nums[i];
        }
        //subtract from last to each index
        int minlen=Integer.MAX_VALUE;boolean check=false;
        for(int i=ps.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                 int x=ps[i]-ps[j];
                 if(target==x)
                 {
                     check=true;
                      minlen=Math.min(minlen,i-j);
                 }
            }
           
        }
        if(check)
        {
            return minlen;
        }
        return 0;
        */
    }
}