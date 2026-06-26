class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        
        int max=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return max;
        
        
    }
}