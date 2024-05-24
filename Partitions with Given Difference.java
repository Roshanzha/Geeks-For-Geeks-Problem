class Solution {
    static int mod = (int) 1e9+7;
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        int sum = 0;
        for(int num : arr) sum += num;
        if( (sum-d) % 2 == 1) return 0;
        int half = (sum-d)/2;
        if(half < 0) return 0;
        int[][] dp = new int[n][half+1];
        for(int[] temp : dp) {
            Arrays.fill(temp, -1);
        }
        return helper(half, 0, n, arr, 0, dp)%mod;
        
    }
    
    private static int helper(int sum, int temp, int n, int[] arr, int idx, int[][] dp) {
        if(idx == n || temp > sum) {
            if(sum == temp) return 1;
            return 0;
        } 
        if(dp[idx][temp] != -1) return dp[idx][temp]%mod;
        int ans = 0;
        ans += helper(sum, temp+arr[idx], n, arr, idx+1, dp);
        ans += helper(sum, temp, n, arr, idx+1,dp);
        return dp[idx][temp] = ans%mod;
    }
}
