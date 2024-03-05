class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i+p;j--)
            {
                if(a[j]>=a[i])
                {
                    p=Math.max(p,(j-i));
                    break;
                }
            }
            if(i+p>=n)
            break;
        }
        return p;
        
    }
}
