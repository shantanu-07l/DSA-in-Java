class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=0;
        for(int num:piles){
            high=Math.max(high,num);
        }
        int result=0;
        while(low<=high){
            int speed=low + (high-low)/2;
            if(isFound(piles,speed,h)){
                result=speed;
                high=speed-1;
            }else{
                low=speed+1;
            }
        }
        return result;
        
    }
    private boolean isFound(int piles[],int speed,int h){
        long hours=0;
        for(int num:piles){
            hours+=(long) (num+speed-1)/speed;
        }
        return hours<=h;
    }
}