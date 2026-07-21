class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']=i;//store index when thay last come
        }
        boolean isVisited[]=new boolean[26];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( isVisited[ch - 'a'] ){
                continue;//if already visited skip
            }

            while(sb.length() >0 && sb.charAt(sb.length()-1) > ch
                 && freq[sb.charAt(sb.length()-1)-'a'] > i){//also check freq idex is greter thatn current
                isVisited[ sb.charAt(sb.length() -1) -  'a']=false;//first make it false

                 sb.deleteCharAt(sb.length() -1);
                 

            }
            isVisited[ch-'a']=true;
            sb.append(ch);

        }
        return sb.toString();

    }
}