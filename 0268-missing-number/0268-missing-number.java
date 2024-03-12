class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int as=0,ar=0;
        for(int i=0;i<n;i++){
            as += nums[i];
        }
        for(int j=0;j<=n;j++){
            ar+=j;
        }
        int ans=ar-as;
        return ans;
    }
}