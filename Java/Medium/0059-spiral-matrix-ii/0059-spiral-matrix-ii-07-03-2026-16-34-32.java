class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];

        int scol=0;
        int srow=0;
        int erow=n-1;
        int ecol=n-1;
        int target=n*n;
        int num=1;
        while(num<=target){
            //top
            for(int j=scol;j<=ecol;j++){
                matrix[srow][j]=num++;
            }
            for(int i=srow+1;i<=erow;i++){
                matrix[i][ecol]=num++;
            }
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                matrix[erow][j]=num++;
            }
            for(int i=erow-1;i>srow;i--){
                if(scol==ecol){
                    break;
                }
                matrix[i][scol]=num++;
            }
            scol++;
            srow++;
            ecol--;
            erow--;
        }
        return matrix;

        
    }
}