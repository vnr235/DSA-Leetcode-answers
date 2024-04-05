class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int a=words[j].indexOf(words[i]);
                int b=words[j].lastIndexOf(words[i]);
                if(a==0 && b==words[j].length()-words[i].length()){
                    count++;
                }
            }
        }
        return count;
    }
    
}