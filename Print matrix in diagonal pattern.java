
class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        ArrayList<Integer>[] al = new ArrayList[n+n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int idx = i+j;
                if(al[idx] == null)al[idx] = new ArrayList<>();
                al[idx].add(mat[i][j]);
            }
        }
        
        int res[] = new int[n*n];
        int idx = 0;
        
        for(int i=0;i<al.length;i++){
            if((i&1) == 1){
                for(int x:al[i]){
                    res[idx++] = x;
                }
            }else{
                Collections.reverse(al[i]);
                for(int x:al[i]){
                    res[idx++] = x;
                }
            }
            
        }
        
        return res;
    }
}
