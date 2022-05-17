class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1,dir=1;
        ArrayList<Integer> al=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            if(dir==1)//left to right move
            {
                for(int i=left;i<=right;i++)
                {
                    al.add(matrix[top][i]);
                }
                top++;
                dir=2;
            }
            else if(dir==2)//top to bottom move
            {
                for(int i=top;i<=bottom;i++)
                {
                    al.add(matrix[i][right]);
                }
                right--;
                dir=3;
            }
            else if(dir==3)//right to left move
            {
                for(int i=right;i>=left;i--)
                {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
                dir=4;
            }
            else if(dir==4)//bottom to top move
            {
                for(int i=bottom;i>=top;i--)
                {
                    al.add(matrix[i][left]);
                }
                left++;
                dir=1;
            }
                
        }
        return al;
    }
}