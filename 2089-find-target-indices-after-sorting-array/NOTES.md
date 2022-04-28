​
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       
        ArrayList<Integer> ls=new ArrayList<>();
        int n=nums.length,temp=0;
        
        for(int i=0;i<n;i++)//sort the given array in increasing order
        {
            for(int j=i+1;j<n;j++)//sort the given array in increasing order
            {
                if(nums[i]>nums[j])
                {
                  temp=nums[i];
                  nums[i]=nums[j];
                  nums[j]=temp;    
                }
            }
        }
        temp=0;
        for(int i=0;i<n;i++)
        {
            if(target == nums[i])
            {
                temp=i;
                ls.add(i);
            }
        }
        return ls;
    }
}
