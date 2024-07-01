// User function Template for Java
class Solution {
    public static Tree convert(Node head, Tree node) {
        // add code here.}
        Queue<Tree> queue = new LinkedList<>();
        node = new Tree(head.data);
        head = head.next;
        queue.add(node);
        
        while(head != null){
            Tree root = queue.remove();
            
            Tree left = new Tree(head.data);
            root.left = left;
            queue.add(left);
            head = head.next;
            
            if(head == null){
                return node;
            }
            
            Tree right = new Tree(head.data);
            root.right = right;
            queue.add(right);
            head = head.next;
        }
        
        return node;
    }
}
