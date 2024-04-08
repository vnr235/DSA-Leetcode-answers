class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        for (int st : students) counts[st]++;
        
        int remaining = sandwiches.length;
        for (int sa : sandwiches) {
            if (counts[sa] == 0) break;
            if (remaining-- == 0) break;
            counts[sa]--;
        }
        
        return remaining;
    }
}