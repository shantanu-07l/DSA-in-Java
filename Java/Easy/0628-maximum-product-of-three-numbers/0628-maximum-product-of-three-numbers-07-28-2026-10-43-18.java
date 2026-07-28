class Solution {
    public int maximumProduct(int[] nums) {
        int max=-1001;
        int sec=-1001;
        int third=-1001;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= max){
                third=sec;
                sec=max;
                max=nums[i];
            }else if(nums[i]>=sec){
                third=sec;
                sec=nums[i];
            }else if( nums[i] > third){
                third=nums[i];
            }

            //update min
            if(nums[i] < min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i] < min2){
                min2=nums[i];
            }
        }
        return Math.max(max * sec * third,min1 * min2 *max);


        
    }
}