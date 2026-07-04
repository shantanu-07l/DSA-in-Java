class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return resolve(0,0,n,m,grid);
    
    }
    private int resolve(int i,int j,int n,int m, int[][] grid){

        //out of bound
        if(i>=n || j>=m) return Integer.MAX_VALUE;

        //destination if only i way
        if(i==n-1 && j==m-1) return grid[i][j];

        //memorization
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int right=resolve(i,j+1,n,m,grid);
        int down=resolve(i+1,j,n,m,grid);
        
        dp[i][j]= grid[i][j] + Math.min(right,down);

        
        return dp[i][j];
    }
}