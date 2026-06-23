class Solution {
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<Integer> ans=new ArrayList<>();

        HashMap<Character,Integer> hm=new HashMap<>();

        for(char ch:s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> hm2=new HashMap<>();
        int start=0;

        for(int end=0;end<s2.length();end++){
            char ch=s2.charAt(end);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);

            while(end-start+1 > s1.length()){
                hm2.put(s2.charAt(start),hm2.get(s2.charAt(start)) -1 );
                if(hm2.get(s2.charAt(start))==0 ){
                    hm2.remove(s2.charAt(start));
                }
                start++;
            }

            if(end-start+1 == s1.length()){
                if(hm.equals(hm2)){
                    return true;
                }
            }
        }
       return false;
        
    }
}