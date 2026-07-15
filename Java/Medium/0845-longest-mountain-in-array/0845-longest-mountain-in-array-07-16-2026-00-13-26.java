class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;

        int inc[]=new int[n];
        int dec[]=new int[n];

        //we declear inc dec size then auto fill all element 0 this qution if no then 0 no need to put 0 alredy present
        for(int i=1;i<n;i++){
            if(arr[i] >  arr[i-1]){
                inc[i]=inc[i-1]  + 1;
            }//no less becuse alredy 0 no need to initialize we define arr size then auto fill 0

        }

        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i+1]){
                dec[i]=dec[i+1] + 1;

            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            //check num is positive then check length 
            //check only id num is peak
            if(inc[i] > 0 && dec[i] > 0){
                ans=Math.max(ans,inc[i] + dec[i] + 1);//plus one becuse we store step not length if length then -1
            }
        }
        return ans;


        
    }
}