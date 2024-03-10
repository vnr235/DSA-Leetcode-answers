class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        int minCommon = Integer.MAX_VALUE;
        for (int s : nums2) {
            if (set.contains(s)) {
                minCommon = Math.min(minCommon, s);
            }
        }
        return minCommon == Integer.MAX_VALUE ? -1 : minCommon;
    }
}