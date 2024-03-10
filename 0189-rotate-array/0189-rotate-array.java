class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<k){
            k=k%nums.length;
        }
        int[] vn=new int[k];
        for(int n=0;n<k;n++){
            vn[k-n-1]=nums[nums.length-n-1];
        }
        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for(int m=0;m<k;m++){
            nums[m]=vn[m];
        }
    }
}