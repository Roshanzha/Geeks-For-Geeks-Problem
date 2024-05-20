//User function Template for Java

class Solution { 
    public long pow(long x, long n, long m) {
        if (n == 0) {
            return 1; // Base case: x^0 is 1
        }
        x = x % m; // Handle x >= m at the start
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) { // If n is odd
                result = (result * x) % m;
            }
            x = (x * x) % m; // Square x and take mod m
            n = n / 2; // Reduce n by half
        }
        return result;
    }
    
    public long PowMod(long x, long n, long m) {
        return pow(x, n, m);
    }
}
