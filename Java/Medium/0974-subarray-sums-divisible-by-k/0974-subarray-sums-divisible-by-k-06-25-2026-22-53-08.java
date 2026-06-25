class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i]) % k;
            if(sum<0){
                sum=sum+k;//to make sum positive 
            }
            if(hm.containsKey(sum)){
                count+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}