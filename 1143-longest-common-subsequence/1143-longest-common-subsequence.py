class Solution:
    def lcs(self,idx1,idx2,s1,s2,dp):
        if(idx1<0 or idx2<0):
            return 0


        if(s1[idx1] == s2[idx2]):
            dp[idx1][idx2] = 1+self.lcs(idx1-1,idx2-1,s1,s2,dp)
            return dp[idx1][idx2]

        if(dp[idx1][idx2] !=-1):
            return dp[idx1][idx2]
        
        
        dp[idx1][idx2]= max(self.lcs(idx1-1,idx2,s1,s2,dp) , self.lcs(idx1,idx2-1,s1,s2,dp))
        return dp[idx1][idx2]


    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        n1=len(text1)
        n2=len(text2)
        dp = [[-1 for _ in range(n2)] for _ in range(n1)]

        return self.lcs(n1-1,n2-1,text1,text2,dp)

        