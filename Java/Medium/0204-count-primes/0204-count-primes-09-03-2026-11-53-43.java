class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean isComposite[]=new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!isComposite[i]){
                for(int j=i*i;j<n;j+=i){
                    isComposite[j]=true;
                }

            }
        }
        int ans=0;
        for(int k=2;k<n;k++){
            if(!isComposite[k]){
                ans++;
            }
        }
        return ans;
        
    }
}