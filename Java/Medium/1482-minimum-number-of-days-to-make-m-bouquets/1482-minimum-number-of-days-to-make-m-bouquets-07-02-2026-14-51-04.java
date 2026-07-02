class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:bloomDay){
            high=Math.max(high,num);
            low=Math.min(low,num);
        }

        int result=-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(isFound(bloomDay,mid,m,k)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;  
    }
    private boolean isFound(int bloomDay[],int mid,int m,int k){
        int count=0;
        int b=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    b++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return b>=m;
    }
}