//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Queue<Integer> que = new LinkedList<>();
        int temp[] = new int[q.size()];
        int i=0;
        while(!q.isEmpty())
        {
            temp[i++]=q.poll();
        }
        for(int j=temp.length-1; j>=0; j--)
        {
            que.add(temp[j]);
        }
        return que;
    }
}
