class Solution {
    public int numOfSubarrays(int[] arr) {
        List<Integer> li= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                li.add(sum);
            }
        }
        int ans=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i)%2 != 0){
                ans ++;
            }
        }
        return ans;
    }
}