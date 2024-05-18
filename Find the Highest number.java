class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<a.size();i++){
            if(ans<a.get(i)){
                ans = a.get(i);
            }
        }
        
        return ans;
    }
}
