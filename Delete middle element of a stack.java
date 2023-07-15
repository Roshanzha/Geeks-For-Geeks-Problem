

//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    int orgSize=0;
    
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
            // code here.. 
            
            orgSize=sizeOfStack;
            helper(s);
        }
    
    public void helper(Stack<Integer>s){
            
            if(s.size()==(orgSize+1)/2){
                s.pop();
                return;
            }
            int temp=s.peek();
            s.pop();
            helper(s);
            s.push(temp);
        }
        
}
