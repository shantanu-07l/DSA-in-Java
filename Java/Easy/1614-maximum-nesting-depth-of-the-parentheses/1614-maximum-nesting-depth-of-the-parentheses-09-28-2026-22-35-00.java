class Solution {
    public int maxDepth(String s) {
        
        int ans=0;
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                depth++;
                if(depth > ans){
                    ans=depth;
                }
            }else if(c!=')'){
                continue;
            }else{
                depth--;
                continue;
            }
        }
        return ans;

    }
}