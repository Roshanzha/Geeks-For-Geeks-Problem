

//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            boolean flag = false;
            for(int j=0;j<S.length();j++){
                if(i==j){
                    continue;
                }
                if(S.charAt(j)==ch){
                    flag = true;
                    break;
                }
            }
            if (flag==false){
                return ch;
            }
           
        }
         return '$';
    }
}
