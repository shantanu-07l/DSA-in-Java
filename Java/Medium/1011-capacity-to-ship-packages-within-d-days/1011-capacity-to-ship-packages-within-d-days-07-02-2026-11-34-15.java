class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int high=0;
        for(int num:weights){
            low=Math.max(low,num);
            high+=num;
        }
        
        int result=0;
        while(low<=high){
            int weight=low + (high -low)/2;
            if(isFound(weights,weight,days,n)){
                result=weight;
                high=weight-1;
            }else{
                low=weight+1;
            }
        }
        return result;
        
    }
    private boolean isFound(int weights[],int weight ,int days,int n){
        int sum=0;
        int day=1;
        for(int num:weights){
            if(sum+num>weight){
                day++;
                sum=num;
            }else{
                sum+=num;
            }
        }
        
        return day<=days;

    }
}