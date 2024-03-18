
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = getMaxCandies(candies);
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= maxCandies);
        }
        return list;
    }
    
    private int getMaxCandies(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        return max;
    }
}
