
class Aug10 {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
         int count=0;
       Node temp=null,start=head,ans=head;
       while(head!=null && head.next!=null){
           count++;
           if(count==k) {
               temp=head;
           }
           head=head.next;
           
       }
       if(temp==null) return start;
       ans=temp.next;
       temp.next=null;
       head.next=start;
       return ans;
    }
}
