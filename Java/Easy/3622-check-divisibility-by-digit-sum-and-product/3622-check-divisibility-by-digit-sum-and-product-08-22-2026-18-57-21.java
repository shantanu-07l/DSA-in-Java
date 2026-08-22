class Solution {
    public boolean checkDivisibility(int n) {
       
        int sum=0;
        int prod=1;
        
        int orignal=n;
        while(n >0){
            int lastDig=n%10;
            sum+=lastDig;
            prod*=lastDig;
            n/=10;
        }
        int total=sum + prod;
        
        return orignal % total==0;
 
    }
}