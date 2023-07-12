

//User function Template for Java

class Solution
{
        
    long power(int n,int p)
    {
        //Your code here
        int mod=1000000007;
        
        if(p==0)
        return 1;
        
        long ans=0;
        if(p%2==0){
            ans=power(n,p/2);
            ans=(ans*ans)%mod;
        }
        else{
            ans=n%mod;
            ans=(ans*power(n,p-1)%mod)%mod;
        }
        
        return (ans)%mod;
    }

}
