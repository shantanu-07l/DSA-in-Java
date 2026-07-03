class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isFound(nums,k,mid)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
           
            }
        }
        return result; 
    }
    private boolean isFound(int nums[],int k,int mid){
        int sum=0;
        int split=1;
        for(int num:nums){
            if(sum+num > mid){
                split++;
                sum=num;
            }else{
                sum+=num;
            }
        }
        return split<=k;
    }
}