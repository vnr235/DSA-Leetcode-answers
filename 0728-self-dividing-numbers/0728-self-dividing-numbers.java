class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if (isSelfDividing(i)) {
                l.add(i);
            }
        }
        return l;
    }
    private boolean isSelfDividing(int i) {
        int o = i;
        while (i > 0) {
            int d = i % 10;
            if (d == 0 || o % d != 0) {
                return false;
            }
            i /= 10;
        }
        return true;
    }
}