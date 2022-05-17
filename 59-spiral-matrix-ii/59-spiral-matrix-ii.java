class Solution {
    public int[][] generateMatrix(int n) {
         int[][] out=new int[n][n];
        int cnt=1,left=0,right=out[0].length-1,top=0,bottom=out.length-1,dir=1;
        while(left<=right && top<=bottom){
            if(dir == 1){ //left --> right
                for(int i=left;i<=right;i++){
                    out[top][i]=cnt;
                    cnt++;
                }
                top++;
                dir=2;
            }
            else if(dir == 2){ //top ---> bottom
                for(int i=top;i<=bottom;i++){
                    out[i][right]=cnt;
                    cnt++;
                }
                right--;
                dir=3;
            }
            else if(dir == 3){ //right ---> left
                for(int i=right;i>=left;i--){
                    out[bottom][i]=cnt;
                    cnt++;
                }
                bottom--;
                dir=4;
            }
            else if(dir == 4){ //bottom --> top
                for(int i=bottom;i>=top;i--){
                    out[i][left]=cnt;
                    cnt++;
                }
                left++;
                dir=1;
            }
        }
        return out;
    }
}