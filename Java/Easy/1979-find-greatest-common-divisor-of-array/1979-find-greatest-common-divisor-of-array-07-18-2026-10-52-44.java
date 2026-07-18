class Solution {
    public int findGCD(int[] nums) {

        int max=0;
        int min=1001;
        for(int num:nums){
            if(num < min){
                min=num;
            }
            if(num > max){
                max=num;
            }
        }
        int a=min;
        int b=max;
        while(b!=0){
            int rem= a % b;
            a=b;
            b=rem;
        }
        return a;
    }
}