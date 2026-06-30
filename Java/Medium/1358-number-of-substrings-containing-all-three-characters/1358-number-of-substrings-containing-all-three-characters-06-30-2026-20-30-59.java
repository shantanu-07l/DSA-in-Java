class Solution {
    public int numberOfSubstrings(String s) {
        int start=0;
        int count=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.size()==3){
                count += s.length() - end;
                char ch2=s.charAt(start);
                hm.put(ch2,hm.get(ch2)-1);
                if(hm.get(ch2)==0){
                    hm.remove(ch2);
                }
                start++;
            }

        }
        return count;
        
    }
}