class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int max[]=new int[n];
        max[0]=nums[0];
        int maxVal=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
            }
            max[i]=maxVal;
        }

        int min[]=new int[n];
        min[n-1]=nums[n-1];
        int minVal=nums[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]<minVal){
                minVal=nums[i];
            }
            min[i]=minVal;
        }

        for(int i=0;i<n;i++){
            int diff=max[i] - min[i];
            if(diff <=k){
                return i;
            }
        }
        return -1;
    }
}