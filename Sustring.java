class Solution {
    int longestCommonSubstr(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[1001][1001];
        // dp[i][j] stores the longest common substring length
        // in s1[0...i-1] and s2[0....j-1]

        // if one of strings have length zero, longest common substring
        // will also be of 0 length
        for (int i = 0; i < n; ++i) dp[i][0] = 0;

        for (int i = 0; i < m; ++i) dp[0][i] = 0;

        int res = 0; // ans
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                // if current characters are same, we increase the length by 1
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                // else, there's no common substring ending at i - 1 and j - 1
                else
                    dp[i][j] = 0;

                res = Math.max(res, dp[i][j]); // storing the answer
            }
        }
        return res;
    }
}
