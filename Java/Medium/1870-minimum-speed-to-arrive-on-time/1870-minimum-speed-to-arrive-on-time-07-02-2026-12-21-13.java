class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=100000000;
        for(int num:dist){
            high=Math.max(high,num);
        }
        int result=-1;
        while(low<=high){
            int speed=low + (high-low)/2;
            if(isFound(dist,speed,hour)){
                result=speed;
                high=speed-1;
            }else{
                low=speed+1;
            }
        }
        return result;
        
    }
    private boolean isFound(int dist[],int speed,double hour){
        double hours=0;
        for(int i=0;i<dist.length-1;i++){
            hours+=(dist[i]+speed-1)/speed;
        }
        hours+=(double) dist[dist.length-1]/speed;
        return hours<=hour;
    }
}