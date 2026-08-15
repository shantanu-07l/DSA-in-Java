class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;

        int leftMin[]=new int[n];
        int rightMax[]=new int[n];

        leftMin[0]=nums[0];
        for(int i=1;i<n;i++){
            leftMin[i]=Math.min(leftMin[i-1],nums[i]);
        }

        rightMax[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1],nums[j]);
        }

        int i=0;
        int j=0;
        int maxDiff=0;
        while(i<n && j<n){
            if(leftMin[i] <= rightMax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxDiff;

    }
}