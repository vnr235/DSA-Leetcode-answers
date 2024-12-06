class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];
        int a=0, b=1;
        for(int nm:nums){
            if(nm >0){
                ans[a]=nm;
                a +=2;
            }
            else{
                ans[b]=nm;
                b+=2;
            }
        }
        return ans;

    }
}
