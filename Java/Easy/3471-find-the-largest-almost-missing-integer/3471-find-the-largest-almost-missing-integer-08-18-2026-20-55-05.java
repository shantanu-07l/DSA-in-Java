class Solution {
    public int largestInteger(int[] nums, int k) {
        int start=0;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> freq=new HashMap<>();
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            if(end-start+1 == k){
                for(int n:map.keySet()){
                    freq.put(n,freq.getOrDefault(n,0)+1);
                }
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                start++;
            }
        }
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int n:freq.keySet()){
            if(freq.get(n) ==1){
                ans=Math.max(ans,n);
            }
        }
        return ans;


        
    }
}