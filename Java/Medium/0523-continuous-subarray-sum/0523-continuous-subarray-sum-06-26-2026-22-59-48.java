class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum= (sum+nums[i]) % k;

            if(hm.containsKey(sum)){
                if(i-hm.get(sum)>=2){
                    return true;
                } 
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return false;
        
        
    }
}