class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list=new ArrayList<>();
       
        long val; int count=0,i=rowIndex;
       
            val=1;
            for(int j=0;j<=i;j++)
            {
                 list.add((int)val);
                val=val*(i-j)/(j+1);
            
            }
           
        
   
         return list;
    }
}