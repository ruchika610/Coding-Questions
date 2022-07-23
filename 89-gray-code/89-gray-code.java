class Solution {
    public List<Integer> grayCode(int n) {
        if(n == 1){
            List<Integer> ans = new ArrayList<>();
            ans.add(0);
            ans.add(1);
            return ans;
        }
        List<Integer> temp = grayCode(n-1);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<temp.size(); i++){
            ans.add(0+2*temp.get(i));
            //System.out.println(0+2*temp.get(i));
        }
        
        for(int i=temp.size()-1; i>=0; i--){
            ans.add(1+2*temp.get(i));
            //System.out.println(1+2*temp.get(i));
        }
        return ans;
    }
}