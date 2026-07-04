class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n][m];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return resolve(0,0,n,m,grid);
    
    }
    private int resolve(int i,int j,int n,int m, int[][] grid){
        
        if(i>=n || j>=m) return 0;
        if(grid[i][j]==1){
            return 0;
        }
        //because of first cheak cell is block or not then write 1 way
        if(i==n-1 && j==m-1) return 1;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        
        dp[i][j]=resolve(i+1,j,n,m,grid) + resolve(i,j+1,n,m,grid);
        
        return dp[i][j];
    }
}