

//User function Template for Java


class Solution
{
    public static int mod = 1000000007;
    public static long fun(int n, long [] dp){
        if(n ==0) return 1;
        if(n<0) return 0;
        
        if(dp[n] != -1) return dp[n];
        long first = fun(n-1, dp);
        long second = fun(n-2, dp);
        long third = fun(n-3, dp);
        
        return dp[n] = (first + second + third)%mod;
    }
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long [] dp = new long[n+1];
        for(int i=0; i<dp.length; i++) dp[i] = -1;
        return fun(n, dp);
    }
    
}
