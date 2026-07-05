class Solution {
    int dp[];
    public int numDecodings(String s) {
        int n=s.length();
        dp=new int[n];
        
        Arrays.fill(dp,-1);
         return solve(0,s,n);
    }
    private int solve(int i,String s,int n){
        //if out of bond 1 way
        if(i==n){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int first=solve(i+1,s,n);
        int second=0;

        if (i + 1 < n) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

            if (num >= 10 && num <= 26) {
                second = solve(i + 2, s, n);
            }
        }

        dp[i]=first + second;
        return dp[i];

    }
}