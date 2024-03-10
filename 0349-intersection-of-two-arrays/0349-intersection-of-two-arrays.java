class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> sat=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int n : nums1){
            sat.add(n);
        }
        for(int s : nums2){
            if(sat.contains(s)){
                list.add(s);
                sat.remove(s);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}