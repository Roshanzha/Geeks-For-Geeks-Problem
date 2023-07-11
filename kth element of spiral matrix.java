

class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	    int top = 0,down = n-1,left = 0,right = m-1;
	    int dir = 0;
	    int idx = 1;
	    while(top<=down && left<=right)
	    {
	        if(dir == 0)
	        {
	            for(int i = left;i<=right;i++)
	            {
	                if(idx == k)
	                    return A[top][i];
	                idx++;
	            }
	            top++;
	        }
	        else if(dir == 1)
	        {
	           for(int i = top;i<=down;i++)
	            {
	                if(idx == k)
	                    return A[i][right];
	                idx++;
	            }
	            right--;
	        }
	        else if(dir == 2)
	        {
	           for(int i = right;i>=left;i--)
	           {
	              if(idx == k)
	                    return A[down][i];
	                idx++; 
	           }
	           down--;
	        }
	        else
	        {
	            for(int i = down;i>=top;i--)
	            {
	                if(idx == k)
	                    return A[i][left];
	                idx++;
	            }
	            left++;
	        }
	        dir = (dir+1)%4;
	    }
	    return -1;
    }
}
