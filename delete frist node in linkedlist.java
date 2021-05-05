pakage com.ds

import java.Util.List
public class LikedListUtil {
   class Linkedlist{
       node head;
    class Node {
        int data;
        Node next;
    }
}
    static Node removeFirstNode(Node head)
    {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
  
        return head;
    }
  
    
    public void  push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
        
    }
    public static void main(String args[])
    {
        Linkedlist linkedlist = new Linkedlist();
        Linkedlist. push(head, 12);
        Linkedlist.push(head, 29);
        Linkedlist.push(head, 11);
        Linkedlist.push(head, 23);
        Linkedlist.push(head, 8);
  
        head = removeFirstNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }