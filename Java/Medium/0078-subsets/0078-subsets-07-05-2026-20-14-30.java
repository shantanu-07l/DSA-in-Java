class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        solve(0,nums,row,ans);
        return ans;
    }

    private void solve(int i,int nums[],List<Integer> row,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add( new ArrayList<>(row));
            return;
        }
        row.add(nums[i]);
        solve(i+1,nums,row,ans);
        row.remove(row.size()-1);
        solve(i+1,nums,row,ans);
    }
}