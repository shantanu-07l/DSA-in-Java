class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int start=0;
        int max=0;
        for(int end=0;end<fruits.length;end++){
            hm.put(fruits[end],hm.getOrDefault(fruits[end],0)+1);
            while(hm.size()>2){
                //first remove key not value because also same type fruit present
                hm.put(fruits[start],hm.get(fruits[start])- 1 );
                if(hm.get(fruits[start]) == 0 ){
                    hm.remove(fruits[start]);
                }
                start++;
            }
            max=Math.max(max,end-start+1);
            
            
        }
        return max;
        
    }
}