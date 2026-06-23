class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int start=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:p.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> hm2=new HashMap<>();

        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);

            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
            while(end-start+1 > p.length()){
                hm2.put(s.charAt(start),hm2.get(s.charAt(start)) -1 );
                if(hm2.get(s.charAt(start))==0 ){
                    hm2.remove(s.charAt(start));
                }
                start++;

            }
            
            if(hm.equals(hm2)){
                ans.add(start);
            }
        }
        return ans;

        
    }
}