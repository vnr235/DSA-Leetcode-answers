class Solution {
    public int search(int[] nums, int target) {
        // int start =0;
        // int end= nums.length-1;
        // int max=start;
        // for(int i=1;i<nums.length;i++){
        //     if(max<nums[i]){
        //         max=nums[i];
        //     }
        // }
        // return max;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}