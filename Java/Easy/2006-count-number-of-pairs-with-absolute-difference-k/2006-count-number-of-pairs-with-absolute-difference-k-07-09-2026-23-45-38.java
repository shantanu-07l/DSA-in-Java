class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int num:nums){
            count+=hm.getOrDefault(num-k,0);
            count+=hm.getOrDefault(num+k,0);
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        return count;
        
    }
}