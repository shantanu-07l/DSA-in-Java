class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        // **Target** frequency map
        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> smap = new HashMap<>();
        String ans="";
        int count = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            if (map.containsKey(ch) && smap.get(ch) <= map.get(ch)) {
                count--;
            }

            // **Shrink** the window while it is valid
            while (count == 0) {
                // Update result
                if (right-left+1 <minLen) {
                    minLen = right - left + 1;
                    ans=s.substring(left,right+1);//substring notcaontain endindex value therfore +1
                }
                
                char leftChar = s.charAt(left);
                smap.put(leftChar, smap.getOrDefault(leftChar, 0) - 1);
                if (map.containsKey(leftChar) && smap.get(leftChar) < map.get(leftChar)) {
                        count++;
                }
                left++;
            }
        }
        return ans;
    }
}