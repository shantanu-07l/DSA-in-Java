class Solution {
    public int findPairs(int[] nums, int k) {

        if(k < 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for(int num : map.keySet()){

            // k = 0 means same number pair
            if(k == 0){
                if(map.get(num) > 1){
                    count++;
                }
            }

            // For k > 0, check num+k exists
            else{
                if(map.containsKey(num + k)){
                    count++;
                }
            }
        }

        return count;
    }
}