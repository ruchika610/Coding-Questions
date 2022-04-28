​
class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
      
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(!hmap.containsKey(nums[i][j]))
                {
                    hmap.put(nums[i][j],1);
                }
                else
                {
                    hmap.put(nums[i][j],hmap.get(nums[i][j])+1);
                }
            }
            
        }
      
         for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
             if(entry.getValue()==nums.length)
             {
                 ans.add(entry.getKey());
             }
         }
       Collections.sort(ans);
        return ans;
    }
}
