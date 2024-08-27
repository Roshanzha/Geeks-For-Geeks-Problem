class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer, List<Pair<Double, Integer>>> graph = new HashMap<>();
        int size = edges.length;
        PriorityQueue<Pair<Double, Integer>> maxProbNodeHeap = new PriorityQueue<>((a, b)->(b.getValue() - a.getValue()));
        for(int indx = 0; indx < size; indx++){
           double probab = succProb[indx];
           int firstNode = edges[indx][0];
           int secondNode = edges[indx][1];
           graph.putIfAbsent(firstNode, new ArrayList<>());
           graph.putIfAbsent(secondNode, new ArrayList<>());
           graph.get(firstNode).add(new Pair<Double, Integer>(probab, secondNode));
           graph.get(secondNode).add(new Pair<Double, Integer>(probab, firstNode));  
        }
        double frmSrcProb[] = new double[n];
        frmSrcProb[start_node] = 1.0;
        maxProbNodeHeap.offer(new Pair<Double, Integer>(frmSrcProb[start_node], start_node));
        while(!maxProbNodeHeap.isEmpty()){
            var currNodePr = maxProbNodeHeap.poll();
            var currProb = currNodePr.getKey();
            var currNode = currNodePr.getValue();
            if(!graph.containsKey(currNode))continue;
            for(var neighPr : graph.get(currNode)){ 
                var neighProb = neighPr.getKey();
                var neighNode = neighPr.getValue();
                var newProb = currProb * neighProb;
                if(newProb > frmSrcProb[neighNode]){
                    frmSrcProb[neighNode] = newProb;
                    maxProbNodeHeap.offer(new Pair<Double, Integer>(newProb, neighNode));
                }
            }
        }
        return frmSrcProb[end_node];
    }
}
