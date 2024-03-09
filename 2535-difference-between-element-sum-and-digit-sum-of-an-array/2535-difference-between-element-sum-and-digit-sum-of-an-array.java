class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0, n=0;
        for(int i=0; i<nums.length;i++){
            sum +=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            while(nums[j]>0){
                int a=nums[j]%10;
                n += a;
                nums[j] /=10;
            }
        }
        int as=sum-n;
        return as;
    }
}