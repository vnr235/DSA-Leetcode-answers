class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> nag= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nag.add(nums[i]);
            }
        }
        int na=nag.size();
        for(int i=0;i<na;i++){
            nums[i] =nag.get(i);
        }
        for(int i=na;i<n;i++){
            nums[i]=0;
        }
        System.out.print(nums);
    }
}