class Solution {
    long max_sum(int a[], int n) {
        long arraySum = 0;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            arraySum += a[i];
            currentSum += i * (long) a[i];
        }

        long maxSum = currentSum;

        for (int i = 1; i < n; i++) {
            currentSum = currentSum + arraySum - n * (long) a[n - i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
