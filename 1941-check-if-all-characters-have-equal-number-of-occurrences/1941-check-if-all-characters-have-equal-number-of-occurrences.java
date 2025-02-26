class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> as= new HashMap<>();
        for(char c: s.toCharArray()){
            as.put(c, as.getOrDefault(c,0)+1);
        }
        Set<Integer> c= new HashSet<>(as.values());
        return c.size()==1;
    }
}