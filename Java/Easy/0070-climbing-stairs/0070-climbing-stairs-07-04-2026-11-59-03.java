class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        return resolve(n);
    }
    int resolve(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=resolve(n-1) + resolve(n-2);
        return dp[n];
    }
}