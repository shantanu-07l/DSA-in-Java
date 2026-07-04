class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        for(int i=0;i<n;i++){
          dp[i]=-1;
        }
        return solve(0,nums);
        
    }
    private int solve(int i,int nums[]){
    
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int firstC=nums[i] + solve(i+2,nums);
        int secC=solve(i+1,nums);
        dp[i]=Math.max(firstC,secC);
        return dp[i];
    }
}