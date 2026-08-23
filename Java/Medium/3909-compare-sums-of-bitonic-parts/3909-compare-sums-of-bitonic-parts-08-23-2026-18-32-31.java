class Solution {
    public int compareBitonicSums(int[] nums) {
        long asce=0;
        long desc=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1] < nums[i]){
                asce+=nums[i-1];
           }else{
            asce+=nums[i-1];
            ans=i-1;
            break;
           }
        }
        for(int i=ans;i<nums.length;i++){
            desc+=nums[i];

        }
        if(asce == desc){
            return -1;
        }else if(asce > desc){
            return 0;
        }
        return 1;
  
    }
}