package BinaryTree;
import static BinaryTree.Tree.Node;
public class LinkedListInBinaryTree {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public static boolean isSubPath(ListNode head,Node root){
        if (root==null)
            return false;
        if (head.val==root.key){
            if (searchPath(head,root))
                return true;
        }
        return isSubPath(head,root.left)|| isSubPath(head,root.right);
  }
  public static boolean searchPath(ListNode head,Node root){
        if (root==null)
            return head==null;
        if (head==null)
            return true;
        if (head.val!=root.key)
            return false;
        return searchPath(head.next,root.left)|| searchPath(head.next,root.right);
  }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.left.left=new Node(5);
        ListNode head=new ListNode(4);
        head.next=new ListNode(5);
        System.out.println(isSubPath(head,root));

    }
}
