

//User function Template for Java

class Solution
{
    public static int count(String str1,int i,int j,int dp[][])
    {
        if(i>=str1.length() || j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        char c=str1.charAt(i);
        char d=str1.charAt(j);
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,f=Integer.MIN_VALUE;
        if(c==d)
        a=count(str1,i+1,j-1,dp)+1;
        b=count(str1,i,j-1,dp);
        f=count(str1,i+1,j,dp);
        return dp[i][j]=Math.max(a,Math.max(b,f));
    }
    public int longestPalinSubseq(String S)
    {
        int dp[][]=new int[S.length()][S.length()];
        for(int i=0;i<S.length();i++)
        Arrays.fill(dp[i],-1);
        return count(S,0,S.length()-1,dp);
        //code here
    }
}
