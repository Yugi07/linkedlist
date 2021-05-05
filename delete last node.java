pakage com.ls;

import java.Util.List

public class LinkedlistUtil {
  
    class Linkedlist{
        Node head;
     class Node {
        int data;
        Node next;
        Node(int data){
        this.data = data;
         next = null;
      }
    }
  }
   public static Node removeLastNode(Node head)
    {
        if (head == null)
            return null;
  
        if (head.next == null) {
            return null;
        }
  
    // Function to push node at head
    public void push(int data)
    {
        Node new_node = new Node(data);
        newnode.next = head;
        head = newnode;
    }
  
   
    public static void main(String args[])
    {
  
       
        Linkedlist linkedlist = new Linkedlist();
        Linkedlist. push(head, 12);
        Linkedlist.push(head, 29);
        Linkedlist.push(head, 11);
        Linkedlist.push(head, 23);
        Linkedlist.push(head, 8);
  
        head = removeLastNode(head);
        while( temp != null){
        temp = temp.next;
            System.out.print(temp.data + "-> ");
    }
}
  