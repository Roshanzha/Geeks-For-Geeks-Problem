class twoStacks
{
    int *arr;
    int size;
    int t1, t2;
    public:
    
    twoStacks(int n=100)
    {
        size = n; 
        arr = new int[n]; 
        t1 = -1; 
        t2 = size;
    }
 
    //Function to push an integer into the stack1.
   void push1(int x)
    {
      //check if space exists
      if(t2-t1 >1)
          arr[++t1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       if(t2-t1 >1)
          arr[--t2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(t1>=0)
        {
            int x = arr[t1--];
            return x;
        }
        return -1;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(t2<size)
        {
            int x = arr[t2++];
            return x;
        }
        return -1;
    }
};
