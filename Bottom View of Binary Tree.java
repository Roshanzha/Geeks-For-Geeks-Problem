
//User function Template for Java

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        int minDisp = 0;
        int maxDisp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> nexts = new LinkedList<>();
        nexts.add(new Pair(root, 0));
        while(!nexts.isEmpty()){
            Pair curr = nexts.poll();
            map.put(curr.value, curr.key.data);
            if(curr.key.left!=null){
                nexts.add(new Pair(curr.key.left, curr.value-1));
            }
            if(curr.key.right!=null){
                nexts.add(new Pair(curr.key.right, curr.value+1));
            }
            minDisp=Math.min(minDisp, curr.value);
            maxDisp=Math.max(maxDisp, curr.value);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=minDisp;i<=maxDisp;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}

class Pair{
    Node key;
    Integer value;
    public Pair(Node key, Integer value){
        this.key=key;
        this.value=value;
    }
}
