class Solution {
    public int minimumPushes(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            count+=(i/8) +1;//becuse 2-9 kepayd press after that make part of that
        }
        return count;
    }
}