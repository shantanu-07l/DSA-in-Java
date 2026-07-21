class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
                
            }else{
                break;
            }
        }
        if (count== n-1){
            return true;
        }
        count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                count++;
                
            }else{
                break;
            }
        }
        if (count== n-1){//n-1 becuse we not go till last idx also we cando make count=1
            return true;
        }

        return false;
        
    }
}