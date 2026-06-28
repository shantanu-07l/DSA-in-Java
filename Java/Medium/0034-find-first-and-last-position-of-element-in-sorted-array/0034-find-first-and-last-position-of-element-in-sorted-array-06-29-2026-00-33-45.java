class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        int n=nums.length;
        int first=firstindex(nums,n,target);
        int last=lastindex(nums,n,target);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    private int firstindex(int arr[],int n,int target){
        int start=0;
        int end=n-1;
        int result=-1;
        
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }else if(arr[mid]> target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    
    private int lastindex(int arr[],int n,int target){
        int start=0;
        int end=n-1;
        int result=-1;
        
        while(start <= end){
            int mid= start+(end-start)/2;
            
            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            }else if(arr[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
                
            
        }
        return result;
    }
}