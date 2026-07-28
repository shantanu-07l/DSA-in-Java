class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int seclarge=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= max){
                seclarge=max;
                max=nums[i];
            }else if(nums[i]< max && nums[i] > seclarge){
                seclarge=nums[i];
            }

        }
        return (max -1) * (seclarge -1);
        
    }
}