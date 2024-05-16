class Solution {
    
     int sol;
    public int minimumEdgeRemove(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++)    list.add(new ArrayList<>());
        
        for(int m[]:edges){
            list.get(m[0]).add(m[1]);
            list.get(m[1]).add(m[0]);
        }
        
        sol=0;
        nodes(1,list,new boolean[n+1]);
        
        return sol;
    }
    
    int nodes(int i,List<List<Integer>> list,boolean vis[]){
        
        vis[i] = true;
        int non=1;
        
        for(Integer nr:list.get(i)){
            
            if(!vis[nr]){
                non+=nodes(nr,list,vis);
            }
        }
        
        if(non%2==0){
            if(i>1) sol++;
            non=0;
        }
        
        return non;
    }

}
