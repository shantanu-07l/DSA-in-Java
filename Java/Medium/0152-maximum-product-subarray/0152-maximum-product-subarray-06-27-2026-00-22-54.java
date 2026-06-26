class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int minpro=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=minpro;
                minpro=maxpro;
                maxpro=temp;
            }
            maxpro=Math.max(nums[i],maxpro * nums[i]);
            minpro=Math.min(nums[i],minpro * nums[i]);

            max=Math.max(max,maxpro);
        }
        return max;


        // int sum=1;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum*=nums[i];
        //     max=Math.max(sum,max);
        //     if(sum==0){
        //         sum=1;
        //     }
        // }
        // sum=1;
        // for(int i=nums.length-1;i>=0;i--){
        //     sum*=nums[i];
        //     max=Math.max(sum,max);
        //     if(sum==0){
        //         sum=1;
        //     }
        // }
        // return max;

        
        
    }
}