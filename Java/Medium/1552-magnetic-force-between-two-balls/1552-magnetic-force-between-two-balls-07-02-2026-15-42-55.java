class Solution {
    public int maxDistance(int[] position, int m) {
        int low=1;
        int high=10000000;
        Arrays.sort(position);
        high=position[position.length-1] - position[0];

        int result=0;
        while(low<=high){
            int mid= low+ (high-low)/2;
            if(isFound(position,m,mid)){
                result=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    private boolean isFound(int position[],int m,int mid){
        int prev=position[0];
        int b=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-prev >=mid){
                b++;
                prev=position[i];
            }

        }
        return b>=m;
    }
}