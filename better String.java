

// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
        int n = str1.length();
        int ch[] = new int[128];
        int i;
        for(i=0;i<128;i++) {
            ch[i]=-1;
        }
        int sub[] = new int[n+1];
        sub[0]=1;
        int s1;
        for(i=1;i<=n;i++) {
            sub[i]=sub[i-1]*2;
            if(ch[str1.charAt(i-1)]==-1) {
                ch[str1.charAt(i-1)]=i;
            } else {
                sub[i]=sub[i]-sub[ch[str1.charAt(i-1)]-1];
                ch[str1.charAt(i-1)]=i;
            }
        }
        s1 = sub[n];
        for(i=0;i<128;i++) {
            ch[i]=-1;
        }
        sub[0]=1;
        int s2;
        for(i=1;i<=n;i++) {
            sub[i]=sub[i-1]*2;
            if(ch[str2.charAt(i-1)]==-1) {
                ch[str2.charAt(i-1)]=i;
            } else {
                sub[i]=sub[i]-sub[ch[str2.charAt(i-1)]-1];
                ch[str2.charAt(i-1)]=i;
            }
        }
        s2=sub[n];
        String s=(s1>=s2) ? str1:str2;
        return s;
    }
}
