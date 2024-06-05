class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long s1=0,s2=0;
        for(long x : a)
        s1+=x;
        for(long x: b)
        s2+=x;
        
        if((s1-s2)%2!=0)
        return -1;
        
        long temp = (s1-s2)/2;
        HashSet<Long> set = new HashSet<>();
        for(long x : a) set.add(x);
        
        for(int i=0; i<m; i++){
            long need = (temp)+b[i];
            
            if(set.contains(need))
            return 1;
        }
       
        return -1;
    }
}
