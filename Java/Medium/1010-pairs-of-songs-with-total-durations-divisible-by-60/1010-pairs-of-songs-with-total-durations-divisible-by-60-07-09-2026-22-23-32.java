class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int num:time){
            int rem=num % 60;
            if(rem <0 ) rem=rem + 60;

            int need=(60 - rem) % 60;
            count+=freq.getOrDefault(need,0);
            freq.put(rem,freq.getOrDefault(rem,0)+1);
        }
        return count;
    }
}