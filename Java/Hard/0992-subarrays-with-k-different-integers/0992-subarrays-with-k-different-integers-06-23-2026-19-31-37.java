class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       
        return atMost(nums,k) - atMost(nums,k-1);
        
    }
    public int atMost(int[] nums,int k){
         int start=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int end=0;end<nums.length;end++){
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);

            while(hm.size()>k){
                hm.put(nums[start],hm.get(nums[start])-1);

                if(hm.get(nums[start]) ==0){
                    hm.remove(nums[start]);
                }
                start++;
            }
            count+=end-start+1;
            
        }
        return count;
    }
    
}