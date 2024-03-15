class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n];
        int[] r=new int[n];
        int[] l=new int[n];
        int p=1,t=1;
        for(int i=0;i<n;i++){
            l[i]=t;
            t*=nums[i];
        }
        for(int o=n-1;o>=0;o--){
            r[o]=p;
            p*=nums[o];
        }
        for(int i=0;i<n;i++){
            ans[i]= l[i]*r[i];
        }
        return ans;
    }
}